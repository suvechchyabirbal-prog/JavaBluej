import java.util.*;

/**
 * Write a description of class Workshop5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Workshop5
{
    public static void main(String [] args){
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter marks");
    int marks= scan.nextInt();
    
    
    if(marks>=40)
    {
        System.out.println("Pass");
    }
    
    else
    {
        System.out.println("Pass");
    }
    
    System.out.println("Enter a number");
    int num= scan.nextInt();
    
    if(num % 2==0)
    {
        System.out.println("Number is even");    
    }
    
    else
    {
        System.out.println("Number is odd");    
    }
    
    System.out.println("Enter a number");
    int number= scan.nextInt();
    
    if(number >= 0)
    {
        System.out.println("Number is positive");    
    }
    
    else if(number==0)
    {
        System.out.println("Number is zero");    
    }
    
    else
    {
        System.out.println("Number is negative");    
    }
    
    System.out.println("Enter a number");
    int Numb= scan.nextInt();
    if(Numb%3 ==0 && Numb%5==0)
    {
           System.out.println("Number is divisible by both.");   
        }
        else
        {
            System.out.println("Number isn't divisible by both.");  
        }
    
    
    System.out.println("Enter a number");
    int No= scan.nextInt();
    
    if(No%3==0)
    {
        if(No%5==0)
        {
           System.out.println("Number is divisible by both.");   
        }
        else
        {
            System.out.println("Number isn't divisible by both.");  
        }
    }
}
}