
package javapracticalsppp;
import java.util.*;

public class Prg12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, sum=0;
        
        System.out.println("Enter the limit: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        
       
        
        for(int i=1; i<=num1; i+=2){
            sum += i;
           System.out.print(i + ", ");
        }
        System.out.println("Ans is -> " + sum);
        
        
    }
    
}
