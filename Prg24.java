
package javapracticalsppp;
import java.util.*;

public class Prg24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Select appropriate actions..");
        System.out.println("1. Check Postive or negative");
        System.out.println("2. ODD or EVEN");
        System.out.println("3. PRIMARY NUMBER: ");
        System.out.println("4. Palindrone");
        System.out.println("5. Armstrong");
        System.out.println("6. Fibonacci");
        System.out.println("7. Exit");
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter Your Choice: ");
        n = sc.nextInt();
        
        switch(n){
            case 1:
                int a;
                System.out.println("Enter number to check POS or neg: ");
                a = sc.nextInt();
                if(a < 0){
                    System.out.print("Negative");
                }
                else
                    System.out.print("Positive");
                
                break;
            case 2:
                    int num;
                    System.out.println("Enter the number: ");
                    num = sc.nextInt();

                    if(num % 2 == 0){
                        System.out.println("Even");
                    }
                    else{
                        System.out.println("ODD");
                    }
                    
            case 3:
                    int pnum;
                    System.out.println("Enter the number: ");
                    pnum = sc.nextInt();
                    for(int i=2; i<pnum; i++){
                        if(pnum % i == 0){
                            System.out.print("Not Prime");
                            break;
                        }
                        else{
                            System.out.print("Prime");
                        }
                    }
            case 4:
                    int num1, digit, temp, rev=0;
                    System.out.println("Enter the number: ");
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
            case 5:
                int num2, digit2, sum2=0, temp2, ans=0;
                System.out.println("Enter the number: ");
                
                num2 = sc.nextInt();
                temp2 = num2;


                while(num2 > 0){
                    digit = num2 % 10;
                    ans += (int)Math.pow(digit, 3);
                    num2 = num2 / 10;
                }

               if(temp2 == ans){
                   System.out.println("Armstrong");
               }
               else{
                   System.out.println("Not");
               }
            case 6:
                int n1=0, n2=1, n3, lim;

                System.out.println("Enter the limit you want: ");
                lim = sc.nextInt();

                System.out.print(n1 + " " + n2 + " ");

                for(int i=2; i<=lim; i++){
                    n3 = n1 + n2;
                    System.out.print(n3 + " ");
                    n1 = n2;
                    n2 = n3;
                }

            default:
                System.exit(0);
                    
                
        }
        
    }
    
}
