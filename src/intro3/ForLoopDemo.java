package intro3;

public class ForLoopDemo {
    public static void main(String[] args)
    {
        // For loop template:
        // for (initialization; condition; increment;)
        // {
        //     Statements... (the body of the loop)
        // }

        // What Java does:
        // 1. Runs the initialization.
        // 2. Tests the condition.  If condition is true, runs the body.  If false, ends the loop.
        // 3. Runs the increment.
        // 4. Goes back to step 2.

        for (int x = 0; x < 10; x++)
        {
            System.out.println("x is " + x);
        }

        System.out.println("Second loop:");
        for (int x = 1; x < 100; x *= 2)
        {
            System.out.println("x is " + x);
        }

        System.out.println("Nested loop:");
        for (int x = 0; x < 5; x++)
        {
            System.out.println("x is " + x);
            for (int y = 0; y < 5; y++)
            {
                System.out.println("x is " + x + " and y is " + y);
            }
        }
    }
}
