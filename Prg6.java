
package javapracticalsppp;
import java.util.*;

public class Prg6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double c, f;
        System.out.println("Enter Celcius: ");
        Scanner sc = new Scanner(System.in);
        c = sc.nextDouble();
        
        f = (c * 9) / 5 + 32;
        
        System.out.println("Fahrenheit: " + f);
               
        
    }
    
}
