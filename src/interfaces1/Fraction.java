package interfaces1;

public class Fraction implements Comparable<Fraction> {
    private int numer;
    private int denom;

    public Fraction(int newNumer, int newDenom) throws RuntimeException
    {
        numer = newNumer;
        denom = newDenom;
        int gcd = gcd(numer, denom);
        numer /= gcd;  // numer = numer/gcd;
        denom /= gcd;

        if (denom < 0)
        {
            numer = -numer;
            denom = -denom;
        }
        if (denom == 0) {
            throw new RuntimeException();
        }
    }

    public Fraction multiply(Fraction other)
    {
        int newNumer = numer * other.numer;
        int newDenom = denom * other.denom;
        Fraction answer = new Fraction(newNumer, newDenom);
        return answer;
    }

    public Fraction add(Fraction other)
    {
        int newNumer = numer * other.denom + denom * other.numer;
        int newDenom = denom * other.denom;
        Fraction answer = new Fraction(newNumer, newDenom);
        return answer;
    }

    public String toString()
    {
        return numer + "/" + denom;
    }

    private static int gcd(int a, int b)
    {
        if (b == 0) return Math.max(a, -a);
        else return gcd(b, a % b);
    }

    @Override
    public int compareTo(Fraction otherFraction) {
        double decimal1 = (double)numer/denom;
        double decimal2 = (double)otherFraction.numer/otherFraction.denom;

        if (decimal1 < decimal2) {
            return -1;
        }
        else if (decimal1 > decimal2) {
            return 1;
        }
        else {
            return 0;
        }
    }
}