package midterm1prep;

import java.util.Arrays;

public class Prep {

    public static void main(String[] args)
    {
        // Call/test your functions here in main.

        problem1();
        int[] array = new int[] {2,4,6,8};
        int[] rev = reverseArray(array);
        System.out.println("original = " + Arrays.toString(array));
        System.out.println("reversed = " + Arrays.toString(rev));


        // Here are some sample 2d arrays for problem 3.  Change them
        // around and use them for test cases.

        int[][] matrix1 = new int[][]
                {
                        {4, 2, 1, 0},
                        {6, 0, 8, 0},
                        {7, 2, 1, 9},
                };
        System.out.println(countZeroRows(matrix1));

        int[][] matrix2 = new int[][]
                {
                        {4, 2, 1},
                        {6, 0, 8},
                        {7, 2, 1},
                        {0, 2, 1},
                };
    }

    public static void problem1()
    {
        for (int i = 3; i < 61; i += 3)
        {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static int[] reverseArray(int[] array)
    {
        int[] rev = new int[array.length];
        int j = array.length-1;
        for (int i = 0; i < rev.length; i++)
        {
            rev[i] = array[j];
            j--;
        }
        return rev;
    }

    public static int countZeroRows(int[][] matrix)
    {
        int count = 0;
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[row].length; col++)
            {
                
                if (matrix[row][col] == 0) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
