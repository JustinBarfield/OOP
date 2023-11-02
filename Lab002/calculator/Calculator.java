package calculator;

public class Calculator {
    public Calculator() {
        
    }

    public static int compute(String[] tokens) throws CalculatorException {
        switch (tokens.length) {
            case 0:
                throw new IllegalInputException("Illegal Token Length");

            case 1:
                if (tokens[0].equalsIgnoreCase("quit")) {
                    throw new QuitException();
                } else {
                    throw new IllegalInputException("Illegal Argument");
                }

            case 2:
                if (tokens[0].equals("-")) {
                    try {
                        int number = Integer.parseInt(tokens[1]);
                        return -number;
                    } catch (NumberFormatException e) {
                        throw new IllegalInputException("Illegal Argument");
                    }
                } else {
                    throw new IllegalInputException("Illegal Operator");
                }

            case 3:
                try {
                    int number1 = Integer.parseInt(tokens[0]);
                    int number2 = Integer.parseInt(tokens[2]);
                    String operator = tokens[1];

                    switch (operator) {
                        case "+":
                            return number1 + number2;
                        case "/":
                            if (number2 == 0) {
                                throw new DivideByZeroException();
                            }
                            return number1 / number2;
                        default:
                            throw new IllegalInputException("Illegal Operator");
                    }
                } catch (NumberFormatException e) {
                    throw new IllegalInputException("Illegal Argument");
                }

            default:
                throw new IllegalInputException("Illegal Token Length");
        }
    }

    public static boolean parseAndCompute(String input) {
        System.out.println("Input was: " + input);

        if (input.equalsIgnoreCase("quit")) {
            System.out.println("Quitting");
            return true;
        }

        try {
            String[] tokens = input.split(" ");

            if (tokens.length != 3) {
                throw new IllegalInputException("Invalid input format");
            }

            int operand1 = Integer.parseInt(tokens[0]);
            int operand2 = Integer.parseInt(tokens[2]);
            String operator = tokens[1];

            int result;

            switch (operator) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    if (operand2 == 0) {
                        throw new DivideByZeroException();
                    }
                    result = operand1 / operand2;
                    break;
                default:
                    throw new IllegalInputException("Unsupported operator: " + operator);
            }

            System.out.println("The result is: " + result);
        } catch (DivideByZeroException e) {
            System.out.println("Tried to divide by zero");
        } catch (IllegalInputException e) {
            System.out.println("Illegal input: " + e.getMessage());
        } catch (CalculatorException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected exception occurred: " + e.getMessage());
        }

        return false;
    }
}


