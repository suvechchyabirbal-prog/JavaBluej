
/**
 * Write a description of class Tutorial3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tutorial3
{
    int agr; //instance variable
    static int rtr;// static variable
    public static void main(String [] args)
    {
        int age=18; //local variable  =32 bits
        System.out.println(age);
        
        //<className> <variable> = New <className>();
        
        Tutorial3 A= new Tutorial3();
        
        System.out.println(A.agr);
        
        System.out.println(rtr);
        
        //implicit typecasting
        
        double db=age;
        
        System.out.println(db);
        
        byte a=32;
        
        short b=a;
        
        // Explicit typecasting
        
        double r=10.9;
        int c= (int) r;
        
        System.out.println(c);
        
        
        long l =100000L;
        short s= (short) l;

        // Exceptions
        
        short st=10;
        short ts=11;
        
        short sum=(short)(st + ts);
        
        byte yt=2;
        byte ty=3;
        
        byte add= (byte)(yt + ty);
        
        // Maximum, Minimum ,bits , bytes
        
        System.out.println(Byte.MAX_VALUE); //MAXIMUM VALUE
        System.out.println(Byte.MIN_VALUE); //MINIMUM VALUE
        System.out.println(Byte.SIZE); // BITS
        System.out.println(Byte.BYTES); //BYTES
        
        // ESCAPE SEQUENCES
        System.out.println("Hello\nWorld"); //for new line
        System.out.println("Hamro\tNepal"); // for tabs
        System.out.println("She said\"hyy\""); //double quotation
        
        // unicode
        System.out.println(\u)
        
        
    
    
    }
}