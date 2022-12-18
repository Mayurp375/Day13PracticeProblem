package classProblemByAmolMateSir.Day13PracticeProblem.demo;

public class MaxInteger {
    Integer x, y, z;

    void checkMax(Integer x, Integer y, Integer z) {
        Integer maximum = x;
        if (y.compareTo(maximum) > 0) {
            maximum = y;
        }
        if (z.compareTo(maximum) > 0) {
            maximum = z;
        }
        System.out.println("max value is "+ maximum);
    }
}
