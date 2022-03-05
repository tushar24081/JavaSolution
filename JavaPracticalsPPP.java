
package javapracticalsppp;
import java.util.*;

public class JavaPracticalsPPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 0;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        if(num % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("ODD");
        }
        
    }
    
}
