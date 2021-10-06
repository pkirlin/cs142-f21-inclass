package fraction;

public class FractionDemo {
    public static void main(String[] args)
    {
        Fraction onethird = new Fraction(1, 3);
        Fraction twofourths = new Fraction(2, 4);
        System.out.println(onethird);
        System.out.println(twofourths);
        Fraction f = new Fraction(64, 128);
        System.out.println(f);
        Fraction f2 = onethird.multiply(twofourths);
        System.out.println(f2);
        Fraction f3 = onethird.add(twofourths);
        System.out.println(f3);
        Fraction f4 = new Fraction(3, 1);
        Fraction f5 = onethird.multiply(f4);
        System.out.println(f5);
        Fraction f6 = new Fraction(1, -3);
        System.out.println(f6);
    }
}
