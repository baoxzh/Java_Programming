public class SimpleCalculator {
    public double calculate(double number1, double number2, char operator) {
        double result;
        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    throw new IllegalArgumentException("Divisor cannot be 0");
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }

        return result;
    }
}