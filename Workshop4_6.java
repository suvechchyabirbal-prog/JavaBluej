import java.util.*;

/**
 * Write a description of class Workshop4_6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Workshop4_6
{
    public static void main(String [] args)
    {
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Enter Marked Price");
       float mp= scan.nextFloat();
       
       System.out.println("Enter the category");
       char category= scan.next().charAt(0);
       float sp,discount=0;
       
       if (category =='A')
       {
        discount=60;
        }
        else if (category =='B')
       {
        discount=40;
        }
        else if (category =='C')
       {
        discount=20;
        }
       else if (category =='D')
       {
        discount=10;
        }
        
        else
        {
             System.out.println("Invalid category");       
        }
        
        sp=mp-(mp*discount/100);
        System.out.println(sp);
        
    
       
       
       
       
       
       
       
       
    }
}