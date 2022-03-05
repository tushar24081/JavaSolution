
package javapracticalsppp;
import java.util.*;

public class Prg17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2;
        System.out.println("Enter the number 1: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        
        System.out.println("Enter the number 2: ");
        num2 = sc.nextInt();
        
        for(int i = num1; i<num2; i++){
            boolean prime = true;
            if(i == 1 || i == 2){
                continue;
            }
            for(int j=2; j<i; j++){
                if(i % j == 0){
                    prime = false;
                }
            }
            if(prime == true){
                System.out.print(i + " ");
            }
        }
       
    }
    
}
