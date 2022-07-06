package it.unicam.cs.lc2122.gedcom.ancdesc;

import java.util.*;
import java.util.stream.Stream;

/**
 * Rappresenta un albero genealogico semplificato.
 *
 * @author Template: Luca Tesei
 */
public class FamilyTree {
    // mappa che contiene tutti gli individui presenti, recuperabili attraverso il
    // loro codice univoco.
    private final Map<String, Individual> elements;

    /**
     * Costruisce un albero genealogico semplificato vuoto.
     */
    public FamilyTree() {
        this.elements = new HashMap<>();
    }

    /**
     * Restituisce un individuo nell'albero.
     *
     * @param code codice univoco dell'individuo da cercare
     * @return l'individuo con il codice indicato, altrimenti null se l'individuo
     * non è presente
     * @throws IllegalArgumentException se non c'&egrave; un individuo col codice dato
     */
    public Individual getIndividual(String code) {
        if (isNotPresent(code)) throw new IllegalArgumentException("Sull'albero genealogico non e` " +
                "presente un individuo col codice: "+code);
        return this.elements.get(code);
    }

    /**
     * Determina se non c'è un certo individuo nell'albero genealogico
     *
     * @param code il codice dell'individuo da ricercare
     * @return true se l'individuo passato non è presente nell'albero genealogico, false
     * altrimenti
     */
    public boolean isNotPresent(String code) {
        return !this.elements.containsKey(code);
    }

    /**
     * Aggiunge un individuo all'albero.
     *
     * @param newIndividual nuovo individuo da aggiungere
     * @return true se l'individuo è stato aggiunto, false se era già presente
     */
    public boolean addIndividual(Individual newIndividual) {
        if (this.elements.containsKey(newIndividual.getCode())) return false;
        this.elements.put(newIndividual.getCode(), newIndividual);
        return true;
    }

    /**
     * Restituisce l'insieme degli individui che sono antenati di un individuo,
     * compreso l'individuo stesso.
     *
     * @param code il codice dell'individuo di partenza
     * @return l'insieme degli antenati dell'individuo di partenza
     */
    public Set<Individual> getAncestorsOf(String code) {
        if (isNotPresent(code)) return Set.of(new Individual(code));
        return getAncestorsOf(new HashSet<>(), getIndividual(code));
    }

    /**
     * Restituisce l'insieme degli individui che sono discendenti di un individuo,
     * compreso l'individuo stesso.
     *
     * @param code il codice dell'individuo di partenza
     * @return l'insieme dei discendenti dell'individuo di partenza
     */
    public Set<Individual> getDescendantsOf(String code) {
        if (isNotPresent(code)) return Set.of(new Individual(code));
        return getDescendantsOf(new HashSet<>(), getIndividual(code));
    }

    /**
     * Ogni individuo aggiunge se stesso al set di discendenti, poi si chiama
     * il metodo ricorsivamente su tutti i figli dell'individuo fin quando
     * &egrave; possibile.
     */
    private Set<Individual> getDescendantsOf(Set<Individual> descendants, Individual individual) {
        // si aggiunge l'individuo al set di discendenti
        descendants.add(individual);
        // si aggiungono ricorsivamente i figli
        individual.getChildren().forEach(i -> getDescendantsOf(descendants, i));
        return descendants;
    }

    /**
     * Ogni individuo aggiunge se stesso al set di antenati, poi si chiama
     * il metodo ricorsivamente sul padre e la madre dell'individuo fin quando
     * &egrave; possibile.
     */
    private Set<Individual> getAncestorsOf(Set<Individual> ancestors, Individual i) {
        // si aggiunge l'individuo al set di antenati
        ancestors.add(i);
        // si raggruppano i genitori
        Stream.of(i.getMother(), i.getFather())
                // si escludono eventuali genitori non presenti
                .filter(Objects::nonNull)
                // si aggiungono ricorsivamente i genitori
                .forEach(p -> getAncestorsOf(ancestors, p));
        return ancestors;
    }

}
