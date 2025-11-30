import java.util.*;

/**
 * Write a description of class Additional_11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Additional_11
{
    public static void main(String [] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter income");
    double income=scan.nextDouble();
    double tax=0;
    
    if (income <= 500000) {
            tax = income * 0.01;
        } 
        else if (income <= 700000) {
            tax = (500000 * 0.01)  + (income - 500000) * 0.10;
        } 
        else if (income <= 1200000) {
            tax = (500000 * 0.01)+ (200000 * 0.10)+ (income - 700000) * 0.20;
        } 
        else if (income <= 2000000) {
            tax = (500000 * 0.01)+ (200000 * 0.10)+ (500000 * 0.20)+ (income - 1200000) * 0.30;
        } 
        else {
            tax = (500000 * 0.01)+ (200000 * 0.10)+ (500000 * 0.20) + (800000 * 0.30)+ (income - 2000000) * 0.36;
        }
        
        System.out.println("Income tax: " + tax);
    }


}