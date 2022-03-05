/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hellowordjava;
import java.util.*;
/**
 *
 * @author TUSHAR
 */
public class Prg32 {
    public static void main(String[] args){
        System.out.println("1. Even ODD ");
        System.out.println("2. PRIME NUMBER ");
        System.out.println("3.Palindrone ");
        System.out.println("4. Armstrong: ");
        System.out.println("5. Exit: ");
        
        int n, ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer number to perform: ");
        n = sc.nextInt();
        
        System.out.println("Enter the choice: ");
        ch = sc.nextInt();
        MathFun m = new MathFun(n);
        switch(ch){
            case 1:
                System.out.println(m.even_odd());
                break;
            case 2:
                System.out.println(m.prime());
                break;
            case 3:
                System.out.println(m.palindrone());
                break;
            case 4:
                System.out.println(m.armstrong());
                break;
            default:
                System.out.println("Not Valid");
                break;        
        }
    }
}

class MathFun{
    int num;
    public MathFun(int num){
        this.num = num;
    }
    public String even_odd(){
        if(num % 2 == 0){
            return "EVEN";
        }
        else{
            return "ODD";
        }
    }
    
    public String prime(){
        int flag = 0;
        for(int i=2; i<num; i++){
            if(num % i == 0){
                flag = 1;
                return "NOT PRIME";
            }
        }
        if(flag == 0){
            return "PRIME";
        }
        else{
            return "NOT PRIME";
        }
        
    
       }
    
    public String palindrone(){
                    int digit, temp, rev=0;
                    temp = num;


                    while(num > 0){
                        digit = num % 10;
                        rev = (rev*10) + digit;
                        num = num / 10;
                    }

                   if(temp == rev){
                       return "Palindrone";
                   }
                   else{
                       return "NOT";
                   }
    
       }
    
        public String armstrong(){
                int digit, sum2=0, temp2, ans=0;
                temp2 = num;
                while(num > 0){
                    digit = num % 10;
                    ans += (int)Math.pow(digit, 3);
                    num = num / 10;
                }

               if(temp2 == ans){
                   return "Armstrong number";
               }
               else{
                   return "Not";
               }
    
       }
}

