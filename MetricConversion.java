import java.util.Scanner;

/**
 * Created by tony on 14/08/2016.
 */
public class MetricConversion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        convertInchesToCentimetres(number);
        convertGallonsToLitres(number);
    }

    public static void convertInchesToCentimetres(int number) {

        double centimetres = number * 2.54;
        System.out.println(number + " inches is equal to " + number + " * 2.54 = "+ String.format("%.2f", centimetres) + " centimetres");
    }

    public static void convertGallonsToLitres(int number) {

        double litres = number * 3.7854;
        System.out.println(number + " gallons is equal to " + number + " * 3.7854 = " + String.format("%.4f",  litres) + " litres");
    }
}
