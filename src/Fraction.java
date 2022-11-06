import java.math.BigDecimal;

public class Fraction {
    private int numerator = 0;
    private int denominator = 1;

    Fraction(){}

    Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Divide by zero!!!");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        normalize();
    }

    Fraction(int numerator) {
        this.numerator = numerator;
        System.out.println("2: I am constructor with numerator " + numerator);
    }

    Fraction(double fraction){
        int scale = BigDecimal.valueOf(fraction).scale();
        this.numerator = (int) (fraction * (Math.pow(10, scale)) * 10) / 10;
        this.denominator = (int) (Math.pow(10, scale)) ;
        normalize();
    }
    Fraction(Fraction fraction){
        this.numerator = fraction.numerator;
        this.denominator = fraction.denominator;
        normalize();
    }
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction mult(Fraction fraction){
        Fraction result = new Fraction();
        result.numerator = numerator * fraction.numerator;
        result.denominator = denominator * fraction.denominator;
        result.normalize();
        return result;
    }

    public Fraction sum(Fraction fraction){
        Fraction result = new Fraction();
        numerator *= fraction.denominator;
        fraction.numerator *= denominator;
        denominator *= fraction.denominator;
        fraction.denominator = denominator;
        result.numerator = numerator + fraction.numerator;
        result.denominator = denominator;
        result.normalize();
        return result;
    }

    double toDecimal() {
        return (double) numerator / denominator;
    }

    private int getGcd() {
        int a = numerator;
        int b = denominator;
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }
    void normalize() { // НОД - Наибольший Общий Делитель и НОК - Наименьшее Общее Кратное
        int gcd = getGcd();
        numerator /= gcd;
        denominator /= gcd;
    }
}
