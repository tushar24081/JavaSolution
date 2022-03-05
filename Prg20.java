
package javapracticalsppp;
import java.util.*;

public class Prg20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        System.out.println("Enter the number 1: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        
       for(int i=0; i<num1; i++){
           for(int j=0; j<=i; j++){
               System.out.print("* ");
           }
           System.out.println();
       } 
       
       for(int i=0; i<=num1; i++){
           for(int j=1; j<=i; j++){
               System.out.print(j + " ");
           }
           System.out.println();
       } 
       
        
       for(int i=0; i<=num1; i++){
           for(int j=1; j<=i; j++){
               System.out.print(i + " ");
           }
           System.out.println();
       } 
       
       for(int i=0; i<=num1; i++){
           for(int j=1; j<=i; j++){
               System.out.print(j + "*".repeat(j));
           }
           System.out.println();
       } 
        
       
    }
    
}
