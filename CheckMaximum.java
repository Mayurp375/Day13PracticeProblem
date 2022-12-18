package classProblemByAmolMateSir.Day13PracticeProblem.demo;

public class CheckMaximum <E>{
    public static void main(String[] args) {
        MaxInteger<Integer> ingergerFind = new MaxInteger<>();
        ingergerFind.checkMax(22,55,25);

        MaxFloate<Float> maxFloate = new MaxFloate<>();
        maxFloate.check((float) 2.2,(float) 3.3,(float) 5.5);

        MaxString<String> maxString = new MaxString<>();
        maxString.check("mayur","sai","anand");
    }
}
