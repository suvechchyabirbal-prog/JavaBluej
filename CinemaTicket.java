import java.util.*;

/**
 * Write a description of class CinemaTicket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CinemaTicket
{
     public static void main(String[] args){
Scanner scan=new Scanner (System.in);
System.out.println("Enter age group' child / adult / senior '");
String age=scan.nextLine();

System.out.println("Movie language: Nepali / Hindi / English");
String language=scan.nextLine();

System.out.println("Student: 'yes/no'");
String student=scan.nextLine();
Boolean isstudent=student.equals("yes");

System.out.println("Festive season: yes/no");
String festival=scan.nextLine();
Boolean isfestival=festival.equals("yes");

double basePrice = 0;

        switch (age) {
            case "child":
                basePrice = 150;
                break;
            case "adult":
                basePrice = 250;
                break;
            case "senior":
                basePrice = 200;
                break;
            default:
                System.out.println("Invalid age group.");
            }
            double price=0;
switch (language) {
            case "hindi":
                price = 50+basePrice;
                break;
            case "english":
                price = 100+basePrice;
                break;
            case "nepali":
                price=basePrice;
    break;
            default:
                System.out.println("Invalid movie language. ");
}
double finalprice=price;
 if (isstudent)
 
 {
    finalprice=finalprice*0.8;
    }
 if (isfestival)
 {
    finalprice=finalprice*0.85;
    }
    
    else
    {
      finalprice=price;
    }

System.out.println("The final price:"+finalprice);
}
}