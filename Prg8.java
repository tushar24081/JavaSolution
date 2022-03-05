
package javapracticalsppp;
import java.util.*;

public class Prg8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, sum=0;
        
        System.out.println("Enter the limit: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        
        for(int i=1; i<=num1; i++){
            sum += i;
        }
        System.out.printf("Sum of %d numbers is %d: ", num1, sum);
        
    }
    
}
