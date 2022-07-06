package it.unicam.cs.lc2122.gedcom.ancdesc;

import it.unicam.cs.lc2122.gedcom.target.GedcomBaseVisitor;
import it.unicam.cs.lc2122.gedcom.target.GedcomParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Rappresenta un visitor per calcolare gli antenati/discendenti di un individuo
 */
public class AnceDescCalculator extends GedcomBaseVisitor<Set<Individual>> {

    private final FamilyTree familyTree;

    public AnceDescCalculator() {
        this.familyTree = new FamilyTree();
    }

    /**
     * Controlla eventuali tag ripetuti dell'header.
     *
     * @param ctx contesto
     * @return dummy value
     * @throws RepeatedTagException se un tag &egrave; dell'header
     *                              a eccezione di HEAD viene ripetuto
     */
    @Override
    public Set<Individual> visitHeader(GedcomParser.HeaderContext ctx) {
        checkRepeatedTag(List.of(ctx.gedc(), ctx.charr(), ctx.datefile(), ctx.file(), ctx.lang()),
                "Nessun tag dell'header puo` essere ripetuto");
        return null;
    }

    /**
     * Visita un nuovo individuo e lo aggiunge all' albero genealogico.
     *
     * @param ctx contesto
     * @return dummy value
     * @throws RepeatedTagException se un tag dell'individuo a eccezione
     *                              di FAMC e FAMS viene ripetuto pi&ugrave; volte
     */
    @Override
    public Set<Individual> visitIndividual(GedcomParser.IndividualContext ctx) {
        // controlla eventuali tag ripetuti
        checkRepeatedTag(List.of(ctx.name(), ctx.sex(), ctx.birt(), ctx.deat(), ctx.deat(), ctx.buri()),
                "Solo i tag FAMC e FAMS dell'individuo possono essere ripetuti");
        // aggiunge l'individuo all'albero genealogico se non gia` presente
        var individual = new Individual(ctx.indi().CODE().getText());
        if (this.familyTree.isNotPresent(individual.getCode())) this.familyTree.addIndividual(individual);
        return null;
    }

    /**
     * Si visita una famiglia e creano i legami di parentela sull'albero genealogico.
     *
     * @param ctx contesto
     * @return dummy value
     * @throws RepeatedTagException     se un tag a eccezione di CHIL &egrave; ripetuto
     * @throws IllegalArgumentException se uno dei tag degli individui non &egrave; presente
     *                                  sull' albero genealogico
     */
    @Override
    public Set<Individual> visitFamily(GedcomParser.FamilyContext ctx) {
        // controllo eventuali tag ripetuti
        checkRepeatedTag(List.of(ctx.husb(), ctx.wife(), ctx.marr()),
                "Solo il tag CHIL della famiglia puo` essere ripetuto");
        // si ottengono gli individui della famiglia
        var husband = ctx.husb().stream().findAny()
                .map(h -> this.familyTree.getIndividual(h.CODE().getText()));
        var wife = ctx.wife().stream().findAny()
                .map(w -> this.familyTree.getIndividual(w.CODE().getText()));
        var children = ctx.chil().stream()
                .map(c -> this.familyTree.getIndividual(c.CODE().getText())).collect(Collectors.toSet());
        // si creano i legami di parentela
        for (Individual child : children) {
            // padre
            husband.ifPresent(h -> {
                h.addChild(child);
                child.setFather(h);
            });
            // madre
            wife.ifPresent(w -> {
                w.addChild(child);
                child.setMother(w);
            });
        }
        return null;
    }

    /**
     * Controlla eventuali tag ripetuti dopo il tag NAME
     *
     * @param ctx contesto
     * @return dummy value
     * @throws RepeatedTagException se dopo il tag NAME, i tag GIVN o SURN sono ripetuti pi&ugrave;
     *                              di una volta
     */
    @Override
    public Set<Individual> visitName(GedcomParser.NameContext ctx) {
        checkRepeatedTag(List.of(ctx.givn(), ctx.surn()), "Dopo il tag NAME, i tag " +
                "GIVN e SURN non possono essere ripetuti piu` di una volta");
        return null;
    }

    /**
     * Controlla eventuali tag ripetuti dopo il tag BIRT
     *
     * @param ctx contesto
     * @return dummy value
     * @throws RepeatedTagException se dopo il tag BIRT, i tag DATE o PLAC sono ripetuti pi&ugrave;
     *                              di una volta
     */
    @Override
    public Set<Individual> visitBirt(GedcomParser.BirtContext ctx) {
        checkRepeatedTag(List.of(ctx.date(), ctx.plac()), "Dopo il tag BIRT, i tag " +
                "DATE e PLAC non possono essere ripetuti piu` di una volta");
        return null;
    }

    /**
     * Controlla eventuali tag ripetuti dopo il tag DEAT
     *
     * @param ctx contesto
     * @return dummy value
     * @throws RepeatedTagException se dopo il tag DEAT, i tag DATE o PLAC sono ripetuti pi&ugrave;
     *                              di una volta
     */
    @Override
    public Set<Individual> visitDeat(GedcomParser.DeatContext ctx) {
        checkRepeatedTag(List.of(ctx.date(), ctx.plac()), "Dopo il tag DEAT, i tag " +
                "DATE e PLAC non possono essere ripetuti piu` di una volta");
        return null;
    }

    /**
     * Controlla eventuali tag ripetuti dopo il tag BURI
     *
     * @param ctx contesto
     * @return dummy value
     * @throws RepeatedTagException se dopo il tag BURI, i tag DATE o PLAC sono ripetuti pi&ugrave;
     *                              di una volta
     */
    @Override
    public Set<Individual> visitBuri(GedcomParser.BuriContext ctx) {
        checkRepeatedTag(List.of(ctx.date(), ctx.plac()), "Dopo il tag BURI, i tag " +
                "DATE e PLAC non possono essere ripetuti piu` di una volta");
        return null;
    }

    /**
     * Controlla eventuali tag ripetuti dopo il tag MARR
     *
     * @param ctx contesto
     * @return dummy value
     * @throws RepeatedTagException se dopo il tag DEAT, i tag DATE o PLAC sono ripetuti pi&ugrave;
     *                              di una volta
     */
    @Override
    public Set<Individual> visitMarr(GedcomParser.MarrContext ctx) {
        checkRepeatedTag(List.of(ctx.date(), ctx.plac()), "Dopo il tag MARR, i tag " +
                "DATE e PLAC non possono essere ripetuti piu` di una volta");
        return null;
    }

    /**
     * Visita prima gli individui e poi le famiglie
     * (questo per evitare che un individuo non sia trovato sull'albero genelogico
     * quando si creano i legami di parentela sulla visita delle famiglie).
     *
     * @param ctx contesto
     * @return dummy value
     * @throws RepeatedTagException     se un tag non pu&ograve; essere ripetuto pi&ugrave; volte
     * @throws IllegalArgumentException se uno dei codici identificativi non &egrave; presente sull'
     *                                  albero genealogico
     */
    @Override
    public Set<Individual> visitRecord(GedcomParser.RecordContext ctx) {
        // separiamo gli individui e le famiglie
        Set<ParseTree> individuals = new HashSet<>();
        Set<ParseTree> families = new HashSet<>();
        for (ParseTree c : ctx.children)
            if (((RuleContext) c.getPayload()).getRuleIndex() == GedcomParser.RULE_individual)
                individuals.add(c);
            else
                families.add(c);
        // visitiamo prima gli individui e poi le famiglie
        individuals.forEach(this::visit);
        families.forEach(this::visit);
        // ritorna valore dummy
        return null;
    }

    /**
     * @return Insieme degli antenati
     */
    @Override
    public Set<Individual> visitAnce(GedcomParser.AnceContext ctx) {
        return this.familyTree.getAncestorsOf(ctx.CODE().getText());
    }

    /**
     * @return Insieme dei discendenti
     * @throws IllegalArgumentException se l'individuo non &egrave; presente sull'albero genealogico
     */
    @Override
    public Set<Individual> visitDesc(GedcomParser.DescContext ctx) {
        return this.familyTree.getDescendantsOf(ctx.CODE().getText());
    }

    /**
     * Controlla eventuali tag multipli
     */
    private void checkRepeatedTag(List<List<? extends ParserRuleContext>> tags, String message) {
        tags.forEach(t -> {
            if (t.size() > 1) throw new RepeatedTagException(message);
        });
    }
}
