package intro3;

public class FunctionPractice {
    // Write your functions here.
    public static double distance(int x1, int y1, int x2, int y2)
    {
        double left = Math.pow(x2 - x1, 2);
        double right = Math.pow(y2 - y1, 2);
        double answer = Math.sqrt(left + right);
        return answer;
    }

    public static int sumRange(int lower, int upper)
    {
        int sum = 0;
        for (int i = lower; i <= upper; i++)
        {
            sum += i;
        }
        return sum;
    }

    public static double totalDistance(int[] points)
    {
        double sum = 0;
        for (int i = 0; i < points.length - 2; i+=2)
        {
            int x = points[i];
            int y = points[i+1];
            int nextX = points[i+2];
            int nextY = points[i+3];
            System.out.println(x + " " + y);
            double dist = distance(x, y, nextX, nextY);
            System.out.println("distance is " + dist);
            sum += dist;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println(totalDistance(new int[] {1,2,3,-4,-3,0,7,1}));
        //System.out.println("SumRange A: " + sumRange(1, 9));
        //System.out.println("SumRange B: " + sumRange(5, 15));
        // Test your functions here.
        //System.out.println("Distance A: " + distance(1, 2, 3, -4));
        //System.out.println("Distance B: " + distance(0, 0, 0, 3));
    }
}
