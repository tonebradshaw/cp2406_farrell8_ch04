/**
 * Created by jc304620 on 16/08/16.
 */
public class Billing {

    public static void main(String[] args) {

        double price = 16.54;
        int quantity = 5;
        double couponValue = 5.67;

        computeBill (price);
        computeBill(price, quantity);
        computeBill(price,  quantity, couponValue);
    }
    public static void computeBill (Double price){

        double total = price * 1.08;
        System.out.println("the total purchase is $" + String.format("%.2f", total));
    }
    public static void computeBill(Double price, int quantity){

        double total = price * quantity * 1.08;
        System.out.println("the total purchase is $" + String.format("%.2f", total));
    }
    public static void computeBill(Double price, int quantity, double couponValue){

        double total = ((price * quantity) - couponValue) * 1.08;
        System.out.println("the total purchase is $" + String.format("%.2f", total));
    }
}
