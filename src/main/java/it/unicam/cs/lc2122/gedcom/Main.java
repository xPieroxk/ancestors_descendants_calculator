package it.unicam.cs.lc2122.gedcom;
import it.unicam.cs.lc2122.gedcom.ancdesc.AnceDescCalculator;
import it.unicam.cs.lc2122.gedcom.target.GedcomLexer;
import it.unicam.cs.lc2122.gedcom.target.GedcomParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream input;
        String inputFile = null;
        if (args.length > 0)
            inputFile = args[0];
        if (inputFile != null)
            input = CharStreams.fromFileName(inputFile);
        else
            input = CharStreams.fromStream(System.in);
        GedcomLexer lexer = new GedcomLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GedcomParser parser = new GedcomParser(tokens);
        ParseTree tree = parser.program();

        // crezione del visitor
        AnceDescCalculator cal = new AnceDescCalculator();
        // stampa antenati/discendenti
        cal.visit(tree).forEach(System.out::println);
    }
}
