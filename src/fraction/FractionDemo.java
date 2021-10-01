package fraction;

public class FractionDemo {
    public static void main(String[] args)
    {
        Fraction onethird = new Fraction(1, 3);
        Fraction twofourths = new Fraction(2, 4);
        Fraction negonethird = new Fraction(1, -3);
        //Fraction illegalFrac = new Fraction(10, 0);
        System.out.println(onethird);
        System.out.println(twofourths);
        System.out.println(negonethird);

        Fraction f = onethird.multiply(twofourths);
        System.out.println(f);
        Fraction f2 = new Fraction(3, 1);
        Fraction f3 = f2.multiply(onethird);
        System.out.println(f3);
        Fraction f4 = onethird.add(twofourths);
        System.out.println(f4);
        Fraction f5 = onethird.add(negonethird);
        System.out.println(f5);
    }
}
