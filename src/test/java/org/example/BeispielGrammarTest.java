package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;




public class BeispielGrammarTest {

    @Test
    public void testValidInput() {
        String input = "1+2";


        omg.beispielLexer lexer = new omg.beispielLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        omg.beispielParser parser = new omg.beispielParser(tokens);

        ParseTree tree = parser.start(); // Ersetze 'start' durch die tatsächliche Startregel deiner Grammatik
        assertEquals(0, parser.getNumberOfSyntaxErrors(), "Es sollten keine Syntaxfehler vorhanden sein.");
    }

    @Test
    public void testInvalidInput() {
        String input = "1+2+a";
        omg.beispielLexer lexer = new omg.beispielLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        omg.beispielParser parser = new omg.beispielParser(tokens);

        parser.start(); // Ersetze 'start' durch die tatsächliche Startregel deiner Grammatik
        assertTrue(parser.getNumberOfSyntaxErrors() > 0, "Es sollten Syntaxfehler vorhanden sein."); // Korrektur hier
    }
}
