
package javapracticalsppp;
import java.util.*;

public class Prg22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str, word;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        str = sc.nextLine();
        
        System.out.println("Enter the Word: ");
        word = sc.nextLine();
        String s[] = str.split(" ");
        
        
        int count = 0;
        for(int i=0; i<s.length; i++){
            if(word.equals(s[i]))
                count++;
            
        }
        
        System.out.println(word + " Occured " + count + "times");
        
       
        
       
    }
    
}
