package intro3;

public class WhileTrueLoopDemo {
    public static void main(String[] args)
    {
        // While true loop example: Generate random numbers between 0 and 9
        // until 5 is generated.  Print out how many times this took.

        int times = 0;
        while (true)
        {
            int num = (int)(Math.random() * 10);
            times++;

            if (num == 5) {
                break;  // end the loop
            }

            System.out.println("Random number: " + num);  // only prints if not equal to 5.
        }
        System.out.println("It took " + times + " times.");
    }
}
