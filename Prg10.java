
package javapracticalsppp;
import java.util.*;

public class Prg10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1=0, n2=1, n3, num1;
        
        System.out.println("Enter the table you want: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        
        System.out.print(n1 + " " + n2 + " ");
        
        for(int i=2; i<=num1; i++){
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
        
        
    }
    
}
