package calculator;
public class IllegalInputException extends CalculatorException {
    public IllegalInputException(String message) {
        super("Illegal input: " + message);
    }
}
