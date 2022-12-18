package classProblemByAmolMateSir.Day13PracticeProblem.demo;

public class CheckMaximum <E>{
    public static void main(String[] args) {
        MaxGeneric<Integer> ingergerFind = new MaxGeneric<>();
        ingergerFind.check(22,55,25,55);

        MaxGeneric<Float> maxFloate = new MaxGeneric();
        maxFloate.check((float) 2.2,(float) 3.3,(float) 5.5, (float) 50);

        MaxGeneric<String> maxString = new MaxGeneric();
        maxString.check("mayur","sai","anand", "mahan");


    }
}
