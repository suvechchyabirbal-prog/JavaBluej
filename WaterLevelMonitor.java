import java.util.*;

/**
 * Write a description of class WaterLevelMonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMonitor
{
    public static void main(String[] args){
        
    Scanner scan = new Scanner(System.in);
    System.out.println("water level");
    int waterlevel=scan.nextInt();            
    
    String warning = (waterlevel>=1000)? "water level is high" : "water level is normal";
    System.out.println(warning);
    
    
}
}   

