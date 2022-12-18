package classProblemByAmolMateSir.Day13PracticeProblem.demo;

public class MaxString {
    String x,y,z;
    void check(String x,String y,String z){
        String maximum = x;
        if(y.compareTo(maximum)>0){
            maximum = y;
        }
        if(z.compareTo(maximum)>0){
            maximum = z;
        }
        System.out.println("max value is "+ maximum);
    }
}
