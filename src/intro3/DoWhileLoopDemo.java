package intro3;

public class DoWhileLoopDemo {
    public static void main(String[] args)
    {
        // Do-While loop example: Generate random numbers between 0 and 9
        // until 5 is generated.  Print out how many times this took.

        int num;
        int times = 0;
        do
        {
            num = (int)(Math.random() * 10);
            System.out.println("Random number: " + num);
            times++;
        } while (num != 5);
        System.out.println("It took " + times + " times.");
    }
}
