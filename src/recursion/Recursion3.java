package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Recursion3 {
    public static void main(String[] args)
    {
        // test sum of arraylist:
        ArrayList<Integer> mylist = new ArrayList<Integer>(Arrays.asList(6,2,10,5));
        System.out.println("Sum is " + sumOfArrayList(mylist));

        // test max of arraylist:
        System.out.println("Max is " + maxOfArrayList(mylist));

    }

    // Calculate the sum of all the elements in an arraylist.
    public static int sumOfArrayList(ArrayList<Integer> list)
    {
        return sumOfArrayList(list, 0);
    }

    // Helper function for above.
    public static int sumOfArrayList(ArrayList<Integer> list, int leftIdx)
    {
        System.out.println(list + " " + leftIdx);
        if (leftIdx == list.size()-1) {  // if there's only one element in our "sub-list"
            return list.get(leftIdx);
        }
        else {
            int smallerSum = sumOfArrayList(list, leftIdx + 1);
            return list.get(leftIdx) + smallerSum;
        }
    }

    // Calculate the largest element in an arraylist.
    public static int maxOfArrayList(ArrayList<Integer> list)
    {
        return maxOfArrayList(list, 0);
    }

    // Helper function for above.
    public static int maxOfArrayList(ArrayList<Integer> list, int leftIdx)
    {
        if (leftIdx == list.size()-1) { // base case: if array size == 1
            return list.get(leftIdx);
        }
        else {
            int smallerMax = maxOfArrayList(list, leftIdx + 1);
            if (smallerMax > list.get(leftIdx)) {
                return smallerMax;
            }
            else {
                return list.get(leftIdx);
            }
        }
    }
    
}
