import java.text.DecimalFormat;

public class Calculator {
    private DecimalFormat decimalFormatter;

    private Randomizer randomizer;

    public Calculator(Randomizer randomizer) {
        this.randomizer = randomizer;
        this.decimalFormatter = new DecimalFormat("#.00");
    }

    public double add(double number1, double number2) {
        return formatTwoDecimalPoints(number1 + number2);
    }

    public double mult(double number1, double number2) {
        return formatTwoDecimalPoints(number1 * number2);
    }

    public double multRandom(double number) {
        double result = 0.0;
        if(number > 10)
            result = randomizer.randomGreaterThanTen() * number;
        else
            result = randomizer.random() * number;

        return formatTwoDecimalPoints(result);
    }

    private double formatTwoDecimalPoints(double number) {
        return Double.parseDouble(decimalFormatter.format(number));
    }
}
