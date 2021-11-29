package lab11;

import java.util.List;

public class CodeTimerDemos {
    public static void main(String[] args)
    {
        measureSumOfArray();

        //measureSumOf2DArray();

        //measureFibonacci();
    }

    public static void measureSumOfArray() {
        ArraySumTimer timer = new ArraySumTimer();
        timer.measureTimeOnAllSizes(List.of(1000, 2000, 4000, 8000, 16000, 32000, 64000));
    }

    public static void measureSumOf2DArray() {
        Array2DSumTimer timer = new Array2DSumTimer();
        timer.measureTimeOnAllSizes(List.of(1000, 2000, 4000, 8000, 16000, 32000, 64000));
    }

    public static void measureFibonacci() {
        FibonacciTimer timer = new FibonacciTimer();
        timer.measureTimeOnAllSizes(List.of(5, 10, 15, 20, 25, 30));
    }
}
