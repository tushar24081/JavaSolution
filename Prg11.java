
package javapracticalsppp;
import java.util.*;

public class Prg11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, res;
        
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println(fact(num1));
    }
    
    public static int fact(int num){
        if(num == 0){
            return 1;
        }
        else{
            return num * fact(num -1);
        }
    }
    
}
