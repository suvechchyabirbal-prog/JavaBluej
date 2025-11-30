import java.util.*;

/**
 * Write a description of class Workshop4_11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Workshop4_11
{
    public static void main(String [] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter income");
    double income=scan.nextDouble();
    double tax=0;
    
    if(income<=500000)
    {
           tax=1/100*income;
    }
    
    else if(income>=500001 && income<=700000)
    {
           tax=10/100*(income-500000)+0.01*500000;
    }
    
    else if(income>=700001 && income<=1000000)
    {
           tax=20/100*(income-700000)+0.01*500000+0.10*200000;
    }
    
    else if(income>=1000001 && income<=2000000)
    {
           tax=30/100*(income-1000000)+0.01*500000+0.10*200000+0.20*300000;
    }
    
    else if(income>=2000001 && income<=5000000)
    {
           tax=36/100*(income-2000000)+0.01*500000+0.10*200000+0.20*300000+0.30*1000000;
    }
    else 
    {
         tax=39/100*(income-5000000)+0.01*500000+0.10*200000+0.20*300000+0.30*1000000+0.36*3000000;
    }
    
    System.out.println("Income tax:"+ tax);
    }
    

}