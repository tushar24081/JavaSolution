
package javapracticalsppp;
import java.util.*;

public class Prg2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        System.out.println("Enter the number 1: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("Enter the number 2: ");
        num2 = sc.nextInt();
        
        System.out.println("ADD: " + (num1 + num2));
        System.out.println("SUB: " + (num1 - num2));
        System.out.println("MUL: " + (num1 * num2));
        System.out.println("DIV: " + (num1 / num2));
        
        
    }
    
}
