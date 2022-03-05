
package javapracticalsppp;
import java.util.*;

public class Prg16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, digit, sum=0, temp, rev=0;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        temp = num1;
        
        
        while(num1 > 0){
            digit = num1 % 10;
            rev = (rev*10) + digit;
            num1 = num1 / 10;
        }
        
       if(temp == rev){
           System.out.println("Palindrone");
       }
       else{
           System.out.println("Not");
       }
    }
    
}
