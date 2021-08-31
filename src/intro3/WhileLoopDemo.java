package intro3;

public class WhileLoopDemo {
    public static void main(String[] args)
    {
        // While loop example: Generate random numbers between 0 and 9
        // until 5 is generated.  Print out how many times this took.

        int num = (int)(Math.random() * 10);
        System.out.println("Random number: " + num);
        int times = 1;
        while (num != 5)
        {
            num = (int)(Math.random() * 10);
            System.out.println("Random number: " + num);
            times++;  // ++ is called the "increment operator" and -- is the "decrement operator"
        }
        System.out.println("It took " + times + " times.");
    }
}
