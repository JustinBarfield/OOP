package calculator;
public class QuitException extends CalculatorException {
    public QuitException() {
        super("Quit requested.");
    }
}