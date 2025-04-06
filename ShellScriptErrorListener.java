import org.antlr.v4.runtime.*;

public class ShellScriptErrorListener extends BaseErrorListener {
    private boolean hasError = false;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        hasError = true;
        System.err.println("Syntax error at line " + line + ":" + charPositionInLine + " - " + msg);

        // Provide suggestions based on common patterns
        if (msg.contains("missing 'then'")) {
            System.err.println("Suggestion: Did you forget to write 'then' after your if condition?");
        } else if (msg.contains("missing 'fi'")) {
            System.err.println("Suggestion: Make sure your if-statement ends with 'fi'.");
        } else if (msg.contains("missing 'do'")) {
            System.err.println("Suggestion: Did you forget 'do' after for/while loop?");
        } else if (msg.contains("missing 'done'")) {
            System.err.println("Suggestion: Make sure your loop ends with 'done'.");
        } else if (msg.contains("mismatched input") && msg.contains("'$'")) {
            System.err.println("Suggestion: Variables must begin with '$', e.g., use $x instead of x.");
        } else if (msg.contains("missing '['")) {
            System.err.println("Suggestion: The condition in if/while must be inside square brackets '[ condition ]'.");
        } else if (msg.contains("missing '='")) {
            System.err.println("Suggestion: Did you forget '=' in an assignment like x=5?");
        } else if (msg.contains("extraneous input")) {
            System.err.println("Suggestion: Check for extra characters or typos in your statement.");
        } else if (msg.contains("no viable alternative")) {
            System.err.println("Suggestion: Check your command syntax. You may have missed a keyword or used an invalid structure.");
        } else if (msg.contains("token recognition error")) {
            System.err.println("Suggestion: You might have used an unsupported character or missed quotes.");
        } else {
            System.err.println("Suggestion: Please review your syntax. Refer to expected shell syntax structure.");
        }
    }

    public boolean hasError() {
        return hasError;
    }
}
