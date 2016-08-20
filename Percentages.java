/**
 * Created by tony on 14/08/2016.
 */
public class Percentages {

    public static void main(String[] args) {


        double a = 2.6;
        double b = 4.7;

        computePercent(a, b);
        computePercent(b, a);
    }

    public static void computePercent(double a, double b) {

        double percent = a/b*100;
        System.out.println(a + " is " + String.format("%.4f", percent) + "% of " + b);
    }
}

