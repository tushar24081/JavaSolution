
package javapracticalsppp;
import java.util.*;

public class Prg4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        System.out.println("Enter the number 1: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        switch(num1){
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default:
                System.out.print("Not Valid");
        }  
        
    }
    
}
