
package javapracticalsppp;
import java.util.*;

public class Prg15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, digit, sum=0;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        
        
        while(num1 > 0){
            digit = num1 % 10;
            sum += digit;
            num1 = num1 / 10;
        }
        
        System.out.println("Sum: " + sum);
    }
    
}
