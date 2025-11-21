import java.util.*;

/**
 * Write a description of class workshop$2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop$2
{
    public static void main(String[] args){
    System.out.println("My name is");
    System.out.println("Suvechchya");
    
    Scanner scan= new Scanner(System.in);
    System.out.println("your name?");
    String name=scan.nextLine();
    
    int a=10;
    int b=10;
    System.out.println(++a);
    System.out.println(a++);
    
    
    System.out.println("your name?");
    String stu_name= scan.nextLine();//for alphabetical letters
    
    System.out.println("your age?");
    int age= scan.nextInt();// for numbers
    
    System.out.println("your GPA?");
    double GPA= scan.nextDouble();//for decimals
    
    System.out.println("value of x");
    int x= scan.nextInt();
    

    System.out.println("value of y");
    int y= scan.nextInt();
    
    int z=x+y;
    System.out.println(z);
    
    
    
   
    
    
    
    
    
}
}