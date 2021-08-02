package calculator;

public class Calculator {

    public static double excute(String input) {
        String[] inputs = input.split(" ");
        double result = Double.parseDouble(inputs[0]);

        for (int i = 1; i < inputs.length; i++) {
            result = getCalculatedResult(inputs, result, i);
        }

        return result;
    }

    private static double getCalculatedResult(String[] inputs, double result, int i) {
        if (isOperator(inputs[i])) {
            result = calculate(inputs, result, i);
        }
        return result;
    }

    private static double calculate(String[] inputs, double result, int i) {
        switch (inputs[i]) {
            case "+":
                result += Double.parseDouble(inputs[i + 1]);
                break;
            case "-":
                result -= Double.parseDouble(inputs[i + 1]);
                break;
            case "*":
                result *= Double.parseDouble(inputs[i + 1]);
                break;
            case "/":
                result /= Double.parseDouble(inputs[i + 1]);
                break;
            default:
                throw new IllegalArgumentException();
        }
        return result;
    }

    private static boolean isOperator(String input) {
        return "+".equals(input) || "-".equals(input) || "*".equals(input) || "/".equals(input);
    }
}
