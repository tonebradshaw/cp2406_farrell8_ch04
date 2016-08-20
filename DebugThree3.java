import java.util.Scanner;

/**
 * Created by tony on 14/08/2016.
 */
public class DebugThree3 {

    static String name;

    public static void main(String args[]){

        getName();
        displayGreeting(name);
    }
    public static String getName(){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.next();
        return name;
    }
    public static void displayGreeting(String name){
        System.out.println("Hello, " + name + "!");
    }
}
