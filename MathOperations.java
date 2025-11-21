import java.util.*;

/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main (String[] args){
        
        int a=10;
        int b=5;
        int c=a+b;
        System.out.println(c);
        
        System.out.println(a++);
        System.out.println(++a);
        
        System.out.println(a>b);
        
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter grade");
        int grade=scan.nextInt();
        
        String A = (grade>=40)? "Pass" : "Fail";
        System.out.println(A);
        
        
        
        
    
    
    
    
    
    }
    
}