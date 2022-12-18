package classProblemByAmolMateSir.Day13PracticeProblem.demo;

public class MaxGeneric<E> {
    E x, y, z;

    <E extends Comparable> void check(E x, E y, E z) {
        E maximum = x;
        if (y.compareTo(maximum) > 0) {
            maximum = y;
        }
        if (z.compareTo(maximum) > 0) {
            maximum = z;
        }
        System.out.println("max value is " + maximum);
    }
}
