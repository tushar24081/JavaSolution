
package javapracticalsppp;
import java.util.*;

public class Prg7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double c, f;
        System.out.println("Enter Fahrenheit: ");
        Scanner sc = new Scanner(System.in);
        f = sc.nextDouble();
        
        c = (f-32) * 5 / 9;
        
        System.out.println("Celcius: " + c);
               
        
    }
    
}
