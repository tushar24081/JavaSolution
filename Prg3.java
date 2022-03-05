
package javapracticalsppp;
import java.util.*;

public class Prg3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, num3, max, min;
        
        System.out.println("Enter the number 1: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("Enter the number 2: ");
        num2 = sc.nextInt();
        System.out.println("Enter the number 3: ");
        num3 = sc.nextInt();
        int[] arr = {num1, num2, num3};
        max = arr[0];
        min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        
        
    }
    
}
