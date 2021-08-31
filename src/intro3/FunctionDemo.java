package intro3;

public class FunctionDemo {
    // For now, our function template looks like:
    // public static return_type function_name(type param1, type param2...)
    // {
    //     statements for the function body...
    // }

    // function takes an integer parameter sideLength, and returns an integer
    public static int areaOfSquare(int sideLength)
    {
        int area = sideLength * sideLength; // or (int)Math.pow(sideLength, 2)
        return area;
    }

    // function takes an integer parameter sideLength, and returns a double
    public static double areaOfTriangle(int base, int height)
    {
        double area = 0.5 * base * height;
        return area;
    }

    // function takes a double parameter and returns a double
    public static double fahToCel(double fah)
    {
        return (5.0 / 9) * (fah - 32);
    }

    // function takes no parameters and returns nothing (void)
    public static void printTemperatureTable()
    {
        for (int fTemp = -40; fTemp <= 100; fTemp += 10)
        {
            double cTemp = fahToCel(fTemp);
            System.out.println(fTemp + " Fahrenheit is " + cTemp + " Celsius.");
        }
    }

    // function takes an array of Strings and returns nothing (void)
    public static void main(String[] args)
    {
        // Examples:
        // Call a function with a literal:
        int squareArea = areaOfSquare(4);

        // Call a function with a variable:
        int b = 5, h = 10;
        double triangleArea = areaOfTriangle(b, h);

        // Functions that return values can be arguments to other functions.
        // In other words, function calls can be nested.
        System.out.println("Area of square: " + squareArea);  // use a variable
        System.out.println("Area of square: " + areaOfSquare(4));  // call the function from inside println

        // call a void function (no return value)
        printTemperatureTable();
    }
}
