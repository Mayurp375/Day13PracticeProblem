package classProblemByAmolMateSir.Day13PracticeProblem.demo;

public class MaxGeneric<E> {
    E x, y, z, i;


    <E extends Comparable> void check(E x, E y, E z, E i) {
        E maximum = x;
        if (y.compareTo(maximum) > 0) maximum = y;
        if (z.compareTo(maximum) > 0) maximum = z;
        if (i.compareTo(maximum) > 0) maximum = i;

        System.out.println("max value is " + maximum);
    }

    <E> void printMax(E x, E y, E z, E maximum) {
        System.out.println("x = " + x + ", y = " + y + ", z = " + z + ", maximum = " + maximum);
    }
}
