package bigoh;

import java.util.List;

public class CodeTimerDemos {
    public static void main(String[] args)
    {
        //measureSumOfArray();

        //measureSumOf2DArray();

        //measureBinarySearch();

        //measureFibonacci();

        //measureFastFibonacci();

        //measureArrayListAddAndRemove();

        //measureArrayListAccess();
    }

    public static void measureSumOfArray() {
        ArraySumTimer timer = new ArraySumTimer();
        timer.measureTimeOnAllSizes(List.of(1000, 2000, 4000, 8000, 16000, 32000, 64000));
    }

    public static void measureSumOf2DArray() {
        Array2DSumTimer timer = new Array2DSumTimer();
        timer.measureTimeOnAllSizes(List.of(1000, 2000, 4000, 8000, 16000, 32000, 64000));
    }

    public static void measureBinarySearch() {
        BinarySearchTimer timer = new BinarySearchTimer();
        timer.measureTimeOnAllSizes(List.of(1000, 2000, 4000, 8000, 16000, 32000, 64000));
    }

    public static void measureFibonacci() {
        FibonacciTimer timer = new FibonacciTimer();
        timer.measureTimeOnAllSizes(List.of(10, 12, 14, 16, 18, 20, 22, 24, 26, 28));
    }

    public static void measureFastFibonacci() {
        FastFibonacciTimer timer = new FastFibonacciTimer();
        timer.measureTimeOnAllSizes(List.of(10, 12, 14, 16, 18, 20, 22, 24, 26, 28));
    }

    public static void measureArrayListAddAndRemove() {
        ArrayListAddAndRemoveTimer timer = new ArrayListAddAndRemoveTimer();
        timer.measureTimeOnAllSizes(List.of(1000, 2000, 4000, 8000, 16000, 32000, 64000));
    }

    public static void measureArrayListAccess() {
        ArrayListAccessTimer timer = new ArrayListAccessTimer();
        timer.measureTimeOnAllSizes(List.of(1000, 2000, 4000, 8000, 16000, 32000, 64000));
    }
}
