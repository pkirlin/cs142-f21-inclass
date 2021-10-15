package prebreak;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Exercises {

    public static void main(String[] args)
    {
        /*ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        reverseArrayList(list);*/
        //String reversed = reverseString("computer");
        //System.out.println("the reversed string is " + reversed);
        ArrayList<String> words = readWords();
        System.out.println(words.size());
        ArrayList<String> wordsWithEveryVowel = wordsContainingEveryVowelExactlyOnce(words);
        System.out.println(wordsWithEveryVowel);
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
        String answer = "";
        for (int i = str.length()-1; i >= 0; i--)
        {
            System.out.println(str.charAt(i));
            answer = answer + str.charAt(i);
        }
        return answer;
    }

    public static ArrayList<String> readWords() {
        InputStream is = Exercises.class.getResourceAsStream("words.txt");
        if (is == null) {
            System.err.println("Could not open file: words.txt");
            System.exit(1);
        }
        Scanner scan = new Scanner(is);

        ArrayList<String> words = new ArrayList<String>();

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            //System.out.println(line);
            words.add(line);
        }
        return words;
    }

    public static int linearSearch(ArrayList<String> list, String lookingFor)
    {
        return 0;
    }

    public static ArrayList<String> wordsContainingEveryVowel(ArrayList<String> list)
    {
        ArrayList<String> everyVowelWords = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++)
        {
            String word = list.get(i); // in python: word = list[i]
            word = word.toLowerCase();

            if (word.contains("a") && word.contains("e") && word.contains("i")
                    && word.contains("o") && word.contains("u"))
            {
                //System.out.println(word);
                everyVowelWords.add(word);
            }
        }
        return everyVowelWords;
    }

    public static ArrayList<String> wordsContainingEveryVowelExactlyOnce(ArrayList<String> list)
    {
        ArrayList<String> everyVowelWords = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++)
        {
            String word = list.get(i); // in python: word = list[i]
            word = word.toLowerCase();

            int countA = 0;
            int countE = 0;
            int countI = 0;
            int countO = 0;
            int countU = 0;
            for (int j = 0; j < word.length(); j++)
            {
                if (word.charAt(j) == 'a') {
                    countA++;
                }
                else if (word.charAt(j) == 'e') {
                    countE++;
                }
                else if (word.charAt(j) == 'i') {
                    countI++;
                }
                else if (word.charAt(j) == 'o') {
                    countO++;
                }
                else if (word.charAt(j) == 'u') {
                    countU++;
                }
            }

            if (countA == 1 && countE == 1 && countI == 1
                && countO == 1 && countU == 1)
            {
                //System.out.println(word);
                everyVowelWords.add(word);
            }
        }
        return everyVowelWords;
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
