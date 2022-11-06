public class Main {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(2, 4);
        Fraction fraction3 = new Fraction(4,10);
        Fraction fraction1 = new Fraction(fraction);
        System.out.println("|---------------Argument : Fraction Exemplar---------------|");
        System.out.println("1 | Before construction : " + fraction);
        System.out.println("1 | After construction : " + fraction1.toDecimal());
        Fraction fraction2 = new Fraction(11.5);
        System.out.println("|---------------Argument : Double value---------------|");
        System.out.println("2 | Before construction : " + fraction2.toDecimal());
        System.out.println("2 | After construction : " + fraction2);
        System.out.println("|---------------Method : mult()---------------|");
        System.out.println("3 | Thirst value : " + fraction);
        System.out.println("3 | Second value : " + fraction3);
        System.out.println("3 | Mult of values : " + fraction.mult(fraction3).toDecimal());
        System.out.println("|---------------Method : sum()---------------|");
        System.out.println("4 | Thirst value : " + fraction);
        System.out.println("4 | Second value : " + fraction3);
        System.out.println("4 | Sum of values : " + fraction.sum(fraction3).toDecimal());
                                 // Сделал красивый вывод \\
    }
}