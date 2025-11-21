import java.util.*;

/**
 * Write a description of class World here.
 *
 * @author Suvechchya Birbal
 * @version v0.1
 */
public class World
{
    public static void main(String[] args){   
    Scanner scan = new Scanner(System.in);
    System.out.println ("Enter first number:");
    int firstNum=scan.nextInt();
    System.out.println ("My first number is:"+ firstNum);
    System.out.println ("Enter second number:");
    double secondNum= scan.nextDouble();
    System.out.println ("My second number is:"+ firstNum);
    
    scan.nextLine();
    System.out.println ("Enter your name");
    String name=scan.nextLine();
    System.out.println ("my name is:"+name);
    
    scan.nextLine();
    System.out.println ("Enter your age");
    int age=scan.nextInt();
    String canDrive = (age>=18)? "Driving is allowed" : "Driving is not allowed";
    System.out.println (canDrive);
    
    
    

}
}