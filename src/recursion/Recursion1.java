package recursion;

public class Recursion1 {

    public static void main(String[] args)
    {
        System.out.println(reverseRec("abcd"));


        for (int i = 1; i <= 10; i++)
        {
            long factAnswer = fact(i);
            System.out.println("The factorial of " + i + " is " + factAnswer);
        }
        for (int i = 1; i <= 10; i++)
        {
            long factAnswer = factRec(i);
            System.out.println("The factorial of " + i + " is " + factAnswer);
        }
    }

    public static long fact(int num)
    {
        long product = 1;
        for (int i = 1; i <= num; i++)
        {
            product = product * i;
        }
        return product;
    }

    public static long factRec(int num)
    {
        if (num == 1) // base case
        {
            return 1;
        }
        else // recursive case
        {
            long recursiveCall = factRec(num - 1);
            return recursiveCall * num;
            // return factRec(num-1) * num;
        }
    }

    public static String reverse(String str)
    {
        String answer = "";
        for (int i = str.length() - 1; i >= 0; i--)
        {
            answer = answer + str.charAt(i);
        }
        return answer;
    }

    public static String reverseRec(String str)
    {
        if (str.length() == 1)
        {
            return str;
        }
        else {
            char lastChar = str.charAt(str.length()-1);
            String revSmaller = reverseRec(str.substring(0, str.length()-1));
            String answer = lastChar + revSmaller;
            return answer;
        }
    }
}
