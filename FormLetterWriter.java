import java.util.Scanner;

/**
 * Created by jc304620 on 16/08/16.
 */
public class FormLetterWriter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your last name: ");
        String lastName = scanner.next();

        displaySalutation(lastName);

        System.out.print("Enter your first name: ");
        String firstName = scanner.next();

        displaySalutation(firstName, lastName);
    }
    public static void displaySalutation(String lastName) {

        System.out.println("Dear Mr or Mrs " + lastName);
        System.out.println("Thank you for your recent order");
    }
    public static void displaySalutation(String firstName, String lastName) {

        System.out.println("Dear " + firstName + " " + lastName);
        System.out.println("Thank you for your recent order");
    }
}
