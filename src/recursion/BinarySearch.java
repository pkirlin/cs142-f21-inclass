package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args)
    {
        // test binary search, iterative version:
        ArrayList<Integer> sortedList = new ArrayList<Integer>(Arrays.asList(6,13,14,25,33,43,51,53,64,72,84,93,95,96,97));
        int indexFound = binarySearchIter(sortedList, 33);
        System.out.println("Iterative version: found at index " + indexFound);

        // test binary search, iterative version:
        indexFound = binarySearchRec(sortedList, 33);
        System.out.println("Recursive version: found at index " + indexFound);
    }


    // Iterative binary search --- remember the arraylist must be sorted!
    public static int binarySearchIter(ArrayList<Integer> list, int key) {
        int low = 0; // far left index
        int high = list.size() - 1;  // far right index

        while (high >= low) {
            System.out.println("low = " + low + " high = " + high);
            int mid = (low + high) / 2;          // find midpoint
            if (list.get(mid) > key) {           // if middle element > key
                high = mid - 1;                  //   next time, look in left half of arraylist
            } else if (list.get(mid) < key) {    // if middle element < key
                low = mid + 1;                   //   next time, look in right half of arraylist
            } else {                             // if middle element == key
                return mid;                      //   return this middle element index
            }
        }
        return -1; // key not found
    }

    // Recursive binary search.
    public static int binarySearchRec(ArrayList<Integer> list, int key) {
        return binarySearchRec(list, key, list.size() - 1, 0);
    }

    // Helper method for above.
    public static int binarySearchRec(ArrayList<Integer> list, int key, int high, int low) {
        if (low > high) {
            return -1;  // item not found!  BOOOOOO!!!!
        }
        else {
            int mid = (low + high) / 2;
            if (list.get(mid) == key) {
                // found the item!  YAYY!!!
                return mid;
            }
            else if (list.get(mid) > key) { // array[mid] > key, keep left half
                // recurse on left half of the array
                //high = mid - 1;
                //int recursiveCall = binarySearchRec(list, key, mid-1, low);
                //return recursiveCall;
                return binarySearchRec(list, key, mid-1, low);
            }
            else // array[mid] < key, keep right half
            {
                return binarySearchRec(list, key, high, mid + 1);
            }
        }
    }
}
