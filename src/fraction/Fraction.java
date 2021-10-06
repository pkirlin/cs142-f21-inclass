package fraction;

public class Fraction {
    private int numer;
    private int denom;

    public Fraction(int newNumer, int newDenom)
    {
        numer = newNumer;
        denom = newDenom;

        int gcd = ExtraMath.gcd(numer, denom);
        numer = numer/gcd;
        denom = denom/gcd;

        if (denom < 0)
        {
            numer = -numer;
            denom = -denom;
        }
    }

    public Fraction multiply(Fraction other)
    {
        int newNumer = numer * other.numer;
        int newDenom = denom * other.denom;
        Fraction product = new Fraction(newNumer, newDenom);
        return product;
    }

    public Fraction add(Fraction other)
    {
        int newNumer = numer * other.denom + denom * other.numer;
        int newDenom = denom * other.denom;
        Fraction sum = new Fraction(newNumer, newDenom);
        return sum;
    }

    public String toString()
    {
        return numer + "/" + denom;
    }
}
