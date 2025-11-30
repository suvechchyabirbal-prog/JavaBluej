
/**
 * Write a description of class Tutorial4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tutorial4
{
    public static void main(String [] args){
    
    int age; //declaration statement
    age=18; //expression statement
    
    System.out.println("Welcome");
    if(age>18)
    {
        System.out.println(age);
    }
    else 
    {
       System.out.println("you're less than 18."); 
    }
    System.out.println("Thankyou !");
    
    // if else if ladder
    int number=10;
    
    if (number>0)
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
    
    //Nested
    
    int num=15;
    
    if(num% 3==0)
    {
        if(num%5==0)
        {
            System.out.println("Divisible by both 3& 5");
        }
        else
        {
            System.out.println("Divisible by 3 but not 5");
        }
    }
    
    else if(num % 5==0)
    {
        System.out.println("Divisible by 5 but not by 3");
    }
    
    else
    {
        System.out.println("Not divisible by both");
    }
    
    
    
    
    
    
    }

}
    