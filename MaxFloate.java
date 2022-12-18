package classProblemByAmolMateSir.Day13PracticeProblem.demo;

public class MaxFloate {
    Float x, y, z;

    void check(Float x, Float y, Float z) {
        float maximum = x;
        if (y.compareTo(maximum) > 0) {
            maximum = y;
        }
        if (z.compareTo(maximum) > 0) {
            maximum = z;
        }
        System.out.println("max value is " + maximum);
    }
}
