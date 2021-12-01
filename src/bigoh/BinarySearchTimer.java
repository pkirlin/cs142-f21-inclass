package bigoh;

import java.util.Arrays;

public class BinarySearchTimer extends CodeTimer {

    @Override
    public double measureTimeOnOneSize(int inputSize) {
        int[] randomNums = RandomArrayMaker.makeRandomSortedArray(inputSize, 10000);

        Stopwatch watch = new Stopwatch();
        watch.start();
        for (long x = 0; x < 20000000; x++) { // for loop that runs the code inside many times

            Arrays.binarySearch(randomNums, (int)(Math.random() * 10000));

        }
        watch.stop();
        return watch.getElapsedTimeInSeconds();
    }
}
