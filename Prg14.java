
package javapracticalsppp;
import java.util.*;

public class Prg14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, esum=0, osum=0;
        System.out.println("Enter the Starting limit: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        
        System.out.println("Enter the Ending limit: ");
        num2 = sc.nextInt();
        
        for(int i=num1; i<=num2; i++){
           if(i%2 == 0){
               esum += i;
           }
           else{
               osum += i;
           }
        }
        System.out.println("Even Sum: " + esum);
        System.out.println("Odd Sum: " + osum);
             
    }
    
}
