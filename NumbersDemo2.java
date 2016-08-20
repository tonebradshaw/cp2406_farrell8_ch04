import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by tony on 14/08/2016.
 */
public class NumbersDemo2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        displayTwiceTheNumber(a, b);
        displayNumberPlusFive(a, b);
        displayNumberSquared(a, b);
    }
    public static void displayTwiceTheNumber(int a, int b){

        System.out.println("Twice " + a + " = " + (2 * a));
        System.out.println("Twice " + b + " = " + (2 * b));
    }
    public static void displayNumberPlusFive(int a, int b){

        System.out.println(a + " plus 5 = " + (a+5));
        System.out.println(b + " plus 5 = " + (b+5));
    }

    public static void displayNumberSquared(int a, int b) {

        System.out.println(a + " squared = " + (int) Math.pow(a, 2));
        System.out.println(b + " squared = " + (int) Math.pow(b, 2));

    }
}
