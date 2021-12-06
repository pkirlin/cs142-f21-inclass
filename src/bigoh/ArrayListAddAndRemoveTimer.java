package bigoh;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAddAndRemoveTimer extends CodeTimer {
    @Override
    public double measureTimeOnOneSize(int inputSize) {

        Stopwatch watch = new Stopwatch();
        watch.start();

        ArrayList<Integer> arraylist = RandomArrayMaker.makeRandomArrayList(inputSize, 10000);
        LinkedList<Integer> linkedlist = new LinkedList<Integer>(arraylist);
        for (int x = 0; x < 1000000; x++) { // for loop that runs the code inside many times

            linkedlist.add(0, 10);
            linkedlist.remove(0);

        }

        watch.stop();
        return watch.getElapsedTimeInSeconds();
    }
}
