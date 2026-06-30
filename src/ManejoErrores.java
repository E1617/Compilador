import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class ManejoErrores extends BaseErrorListener {
    public boolean huboError = false;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {

        huboError = true;

        // Determinar si es error de Lexer o Parser
        String tipoError = (offendingSymbol instanceof Token) ? "SINTÁCTICO (Parser)" : "LÉXICO (Lexer)";

        System.err.println("\n--- ERROR " + tipoError + " DETECTADO ---");
        System.err.println("Ubicación: Línea " + line + ":" + charPositionInLine);
        System.err.println("Mensaje: " + msg);

        if (offendingSymbol instanceof Token) {
            Token t = (Token) offendingSymbol;
            System.err.println("Token problemático: '" + t.getText() + "'");
        }
        System.err.println("------------------------------------------\n");
    }
}