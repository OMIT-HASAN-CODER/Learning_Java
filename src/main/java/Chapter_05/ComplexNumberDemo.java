package Chapter_05;

class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public ComplexNumber plus(ComplexNumber b) {
        double real = this.re + b.re;
        double imag = this.im + b.im;

        return new ComplexNumber(real, imag);
    }

    public ComplexNumber minus(ComplexNumber b) {
        double real = this.re - b.re;
        double imag = this.im - b.im;

        return new ComplexNumber(real, imag);
    }

    public String toString() {
        if (im == 0) {
            return re + "";
        }
        if (re == 0) {
            return im + "i";
        }
        if (!(im < 0)) {
            return re + " + " + im + "i";
        }

        return re + " - " + (-im) + "i";
    }
}

public class ComplexNumberDemo {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(5.0, 6.0);
        ComplexNumber b = new ComplexNumber(-3.0, 4.0);

        System.out.println("a             = " + a);
        System.out.println("b             = " + b);
        System.out.println("b + a         = " + b.plus(a));
        System.out.println("a - b         = "+ a.minus(b));
    }
}
