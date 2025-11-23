import java.util.*;

/**
 * Write a description of class RickshawFare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RickshawFare
{
    public static void main(String [] args){
Scanner scan = new Scanner(System.in);

System.out.println(" Base fare");
double z=scan.nextDouble(); 

System.out.println(" Distance");
double x=scan.nextDouble(); 
System.out.println(x+ " km");

System.out.println(" Time");
double y=scan.nextDouble();
System.out.println(y+ " minutes");


System.out.println(" Fare per distance");
double b= scan.nextDouble();


System.out.println(" Fare per minute");
double c= scan.nextDouble();

System.out.println("are they local?(true/false)?");
String local=scan.nextLine();

System.out.println("is it night time?(true/false)?");
String night=scan.nextLine();



double discount =(x>10 && local.equals("yes"))? 0.20 : 0.0;
double nightcharge =(night.equals("yes"))? 0.25 : 0.0;

double a=(z + (x*b) + (y*c));
a=a-(a*discount);
a=a+(a*nightcharge);
System.out.println("final fare = Rs."+(int) a);





}
}