import java.util.Scanner;

/**
 * Created by tony on 14/08/2016.
 */
public class Percentages2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number with at least 1 decimal place: ");
        double number = scanner.nextDouble();
        System.out.print("Enter a second number with at least 1 decimal place: ");
        double secondNumber = scanner.nextDouble();

        computePercent(number, secondNumber);
        computePercent(secondNumber, number);
    }
    public static void computePercent(double a, double b) {

        double percent = a/b*100;
        System.out.println(a + " is " + String.format("%.4f", percent) + "% of " + b);
    }
}
