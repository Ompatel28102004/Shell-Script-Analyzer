import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ShellScriptAnalyzer {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.err.println("Usage: java ShellScriptAnalyzer <script.sh>");
            return;
        }

        String scriptContent = new String(Files.readAllBytes(Paths.get(args[0])));
        CharStream input = CharStreams.fromString(scriptContent);
        ShellScriptLexer lexer = new ShellScriptLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ShellScriptParser parser = new ShellScriptParser(tokens);

        ShellScriptErrorListener errorListener = new ShellScriptErrorListener();
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        parser.script(); // Trigger the parsing

        if (!errorListener.hasError()) {
            System.out.println("Parsing completed successfully! No syntax errors found.");
        }
    }
}
