package testExample;


import java.util.stream.IntStream;

public class Maths {
    /**
     * Overly complicated method to calculate "a" to the power of "b"
     * @param a base
     * @param b exponent
     * @return a to the power of b
     */
    public static int pow(int a, int b) {
        return IntStream.range(0, b)
                .map(x -> a)
                .reduce((x, y) -> x * y)
                .orElseThrow();
    }

    /**
     * Simple method to add two integers
     * @param a first value
     * @param b second value
     * @return sum of the two values
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Simple method to subtract two integers
     * @param a first value
     * @param b second value
     * @return difference between a and b
     */
    public static int sub(int a, int b) {
        return a - b;
    }
}
