package bigoh;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAccessTimer extends CodeTimer {
    @Override
    public double measureTimeOnOneSize(int inputSize) {

        Stopwatch watch = new Stopwatch();
        watch.start();

        ArrayList<Integer> arraylist = RandomArrayMaker.makeRandomArrayList(inputSize, 10000);

        for (int x = 0; x < 2000000; x++) { // for loop that runs the code inside many times

            arraylist.get(arraylist.size() / 2); // access the middle element

        }

        watch.stop();
        return watch.getElapsedTimeInSeconds();
    }
}
