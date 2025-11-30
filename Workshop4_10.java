import java.util.*;

/**
 * Write a description of class Workshop4_10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Workshop4_10
{
    public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
       
     System.out.println("Enter the from A0 to A5 category");
     String category= scan.nextLine();
        
       
       
       switch (category)
       {
            case "A0":
                
                System.out.println("841x1189 mm(33.1x46.8 inches)");
                break;
            case "A1":
                System.out.println("594x841 mm(23.4x33.1inches)");
                break;
                
            case "A2":
                System.out.println("420x594 mm(16.5x23.4 inches)");
                break;
                
            case "A3":
                System.out.println("297x420 mm(11.7x16.5 inches)");
                break;
                
            case "A4":
                System.out.println("210x297 mm(8.3x11.7 inches)");
                break;
                
            case "A5":
                System.out.println("148x210 mm (5.8x8.3 inches)");
                break;
            
            default:
            
                System.out.println("Invalid category");
                return;
            
        }
    }
}