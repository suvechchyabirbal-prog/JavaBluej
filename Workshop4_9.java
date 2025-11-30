import java.util.*;

/**
 * Write a description of class Workshop4_9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Workshop4_9
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
       
       System.out.println("Enter GPA ");
       float gpa= scan.nextFloat();
       
       System.out.println("Enter Attendence in % ");
       float attandance= scan.nextFloat();
       
       System.out.println("Enter Attitude score ");
       float attitude= scan.nextFloat();
       
       if(gpa>=3.2)
       {
            if(attandance>80)
            {
                if(attitude<5)
                {
                    System.out.println("Student is eligible for scholarship");
                }
                
                else
                {
                    System.out.println("Student is not eligible for scholarship");
                }
            }
        }
    }
}