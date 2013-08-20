import java.text.DecimalFormat;

public class Calculator {
    DecimalFormat decimalFormatter = new DecimalFormat("#.00");

    public double add(double number1, double number2) {
        return formatTwoDecimalPoints(number1 + number2);
    }

    public double mult(double number1, double number2) {
        return formatTwoDecimalPoints(number1 * number2);
    }

    public double multRandom(double number) {
        return formatTwoDecimalPoints((Math.random() * 10) * number);
    }

    private double formatTwoDecimalPoints(double number) {
        return Double.parseDouble(decimalFormatter.format(number));
    }
}
