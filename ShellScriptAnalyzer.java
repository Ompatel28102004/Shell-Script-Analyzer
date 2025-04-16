import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ShellScriptAnalyzer {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.err.println("Usage: java ShellScriptAnalyzer <script.sh>");
            return;
        }

        // Read input file
        String scriptContent = new String(Files.readAllBytes(Paths.get(args[0])));
        CharStream input = CharStreams.fromString(scriptContent);

        // Lexer
        ShellScriptLexer lexer = new ShellScriptLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Debug: Print token stream
        System.out.println("Token Stream:");
        tokens.fill(); // Ensure all tokens are fetched
        List<Token> tokenList = tokens.getTokens();
        for (Token token : tokenList) {
            System.out.println("  " + token.getText() + " -> " + ShellScriptLexer.VOCABULARY.getDisplayName(token.getType()));
        }

        // Parser
        ShellScriptParser parser = new ShellScriptParser(tokens);
        parser.removeErrorListeners();
        ShellScriptErrorListener errorListener = new ShellScriptErrorListener();
        parser.addErrorListener(errorListener);

        // Parse
        ParseTree tree = parser.program();

        // Output results
        if (!errorListener.hasError()) {
            System.out.println("\nParsing completed successfully! No syntax errors found.\n");
            System.out.println("Parse Tree: " + tree.toStringTree(parser));
        }
    }
}