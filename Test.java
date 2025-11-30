import java.util.*;

/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your annual income (NPR): ");
        double income = sc.nextDouble();
        double tax = 0;

        if (income <= 500000) {
            tax = income * 0.01;
        } else if (income <= 700000) {
            tax = 500000 * 0.01 + (income - 500000) * 0.10;
        } else if (income <= 1200000) {
            tax = 500000 * 0.01 + 200000 * 0.10 + (income - 700000) * 0.20;
        } else if (income <= 1500000) {
            tax = 500000 * 0.01 + 200000 * 0.10 + 500000 * 0.20 + (income - 1200000) * 0.30;
        } else {
            tax = 500000 * 0.01 + 200000 * 0.10 + 500000 * 0.20 + 300000 * 0.30 + (income - 1500000) * 0.36;
        }

        System.out.println("Total tax payable: NPR " + tax);
        sc.close();
    }

}