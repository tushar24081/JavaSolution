
package javapracticalsppp;
import java.util.*;

public class Prg23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, sum=0, avg, pos=0, neg=0;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        int[] arr = new int[num1];
        
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter the element for " + i);
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        avg = sum / arr.length;
        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                neg++;
            }
            else if(arr[i] > 0){
                pos++;
            }
            
            if(arr[i] > max){
                max = arr[i];
            }
            
            if(arr[i] < min){
                min = arr[i];
            }
        }
        
        
       System.out.println("Sum: " + sum);
       System.out.println("Avg: " + avg);
       System.out.println("max: " + max);
       System.out.println("min: " + min);
       System.out.println("positive: " + pos);
       System.out.println("negative: " + neg);
        
        
    }
    
}
