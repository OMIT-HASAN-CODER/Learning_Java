package Chapter_03;

class PiCalculator {
    public double calculator(int nTerms) {
        double numerator = 4.0;
        double denominator = 1.0;
        double sign = 1.0;

        double pi = 0.0;
        for (int i = 0; i < nTerms; i++) {
            pi += sign * (numerator / denominator);
            denominator += 2.0;
            sign *= -1.0;
        }
        return pi;
    }
}

public class PiCalculatorDemo {
    public static void main(String[] args) {
        PiCalculator piCalculator = new PiCalculator();
        var pi = piCalculator.calculator(100_000);
        System.out.println("pi = " + pi);
    }
}
