import java.util.Scanner;

/**
 * Created by tony on 14/08/2016.
 */
public class BookstoreCredit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.next();
        System.out.print("Enter your last name: ");
        String lastName = scanner.next();
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        computeCredit(firstName, lastName, gpa);
    }

    public static void computeCredit(String firstName, String lastName, double gpa) {

        double credit = gpa * 10;

        System.out.println(firstName + " " + lastName + ", you have a GPA of " + gpa + " and therefore have gained a credit of $" +
                String.format("%.2f", credit) + " towards their books");
    }
}
