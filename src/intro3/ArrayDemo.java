package intro3;

public class ArrayDemo {
    public static void main(String[] args)
    {
        // An "array" is what Java calls the equivalent of a Python list.
        // Main difference: in Python, we just have "lists," whereas in Java,
        // lists have to know ahead of time what data type they hold.

        // Two ways to create an array:
        int[] intArray = new int[5];  // create a new array of integers (uninitialized).
        int[] scores = new int[] {80, 88, 95, 90};  // create a new array of integers and initialize them.
        int[] scores2 = {80, 88, 95, 90};  // shorthand for line above.

        // More examples:
        boolean[] boolArray = new boolean[10];  // from lab
        double[] radioStations = {101.5, 98.7, 99.1, 100.3};
        String[] cities = new String[] {"Memphis", "Nashville", "Knoxville", "Chattanooga"};

        // "Standard for loop" over an array:  (just like in Python)
        // for (int i = 0; i < arrayVariable.length; i++)

        // Print everything in an array:
        for (int i = 0; i < radioStations.length; i++)
        {
            System.out.println("Listening to station " + radioStations[i]);
        }

        // Fill an array with random numbers between 1 and 100:
        int[] randomNumbers = new int[10];
        for (int i = 0; i < randomNumbers.length; i++)
        {
            randomNumbers[i] = (int)(Math.random() * 100 + 1);
        }

        // Write code to print out all the numbers in the randomNumbers array, and their average.
        // If you finish quickly, also find and print the minimum and maximum number.
        double sum = 0;
        for (int i = 0; i < randomNumbers.length; i++)
        {
            System.out.println("the number is " + randomNumbers[i]);
            sum = sum + randomNumbers[i];
        }
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + sum/randomNumbers.length);
    }
}
