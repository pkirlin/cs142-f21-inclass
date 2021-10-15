package prebreak;

import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercises {

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        reverseArrayList(list);
        System.out.println(list);
        String mystring = "phone";
        reverseString(mystring);
    }

    public static void reverseArrayList(ArrayList<Integer> list)
    {
        int j = list.size() - 1;
        for (int i = 0; i < list.size()/2; i++)
        {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            System.out.println("swap index " + i + " with " + j);
            j--;
        }
    }

    public static String reverseString(String str)
    {
        for (int i = str.length() - 1; i >= 0; i--)
        {
            System.out.println(str.charAt(i));
        }
        return "";
    }

    public static ArrayList<String> readWords() {
        InputStream is = Exercises.class.getResourceAsStream("words.txt");
        if (is == null) {
            System.err.println("Could not open file: words.txt");
            System.exit(1);
        }
        Scanner scan = new Scanner(is);

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            System.out.println(line);
        }
        return null;
    }

    public static int linearSearch(ArrayList<String> list, String lookingFor)
    {
        return 0;
    }

    public static ArrayList<String> wordsContainingEveryVowel(ArrayList<String> list)
    {
        return null;
    }

    public static ArrayList<String> wordsContainingEveryVowelExactlyOnce(ArrayList<String> list)
    {
        return null;
    }

    public static ArrayList<String> lettersInAlphaOrder(ArrayList<String> list)
    {
        return null;
    }

    public static ArrayList<String> findPalindromes(ArrayList<String> list)
    {
        return null;
    }

    public static ArrayList<String> simpleAutocorrect(ArrayList<String> list, String word)
    {
        return null;
    }
}
