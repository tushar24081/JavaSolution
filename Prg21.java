
package javapracticalsppp;
import java.util.*;

public class Prg21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str2;
        System.out.println("Enter the number 1: ");
        Scanner sc = new Scanner(System.in);
        str2 = sc.nextLine();
        StringBuilder str = new StringBuilder(str2);
        System.out.println("Length of String " + str.length());
        System.out.println("Capacity of String " + str.capacity());
        System.out.println("Upper Case " + str2.toUpperCase());
        System.out.println("Extract " + str.substring(0, 6));
        System.out.println("Reverse " + str.reverse());
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a')
            {
                count++;
            }
        }
        System.out.println("A occured : " + count + "times");
        
        
        
       
        
       
    }
    
}
