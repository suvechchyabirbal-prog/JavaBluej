import java.util.*;

/**
 * Write a description of class AushadhiPasal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AushadhiPasal
{
    public static void main(String[] args){
        
    Scanner scan = new Scanner(System.in);
    System.out.println("medicine name");
    String x=scan.nextLine(); 
    String y=scan.nextLine(); 
    String z=scan.nextLine(); 
    
    
    
    System.out.println("Price of medicine");
    int a=scan.nextInt();  
    int b=scan.nextInt();  
    int c=scan.nextInt();  
    
    System.out.println("Quantity of medicine in stock");
    int j=scan.nextInt(); 
    int k=scan.nextInt(); 
    int l=scan.nextInt(); 
    
    System.out.println("-----------------------------");
    System.out.println("    PHARMACY INVENTORY");
    System.out.println("-----------------------------");                               
    
    System.out.println("Medicine Name");
    System.out.println("  Name | Stock | Price");
    System.out.println("-----------------------------");
    System.out.println(x + "   | " +a+ " |" +j);
    System.out.println(y + "  | " +b+ " |" +k);
    System.out.println(z + "  | " +c+ " |" +l);
    System.out.println("-----------------------------");     
    
    
    

    
}
}