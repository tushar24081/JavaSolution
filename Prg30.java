
package hellowordjava;
import java.util.*;

public class Prg30 {
    public static void main(String[] args){
        int n1, n2;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        n1 = sc.nextInt();
        
        System.out.println("Enter number 2: ");
        n2 = sc.nextInt();
        
        System.out.println("Enter Operation: ");
        op = sc.next().charAt(0);
        
        MathOp m = new MathOp(n1, n2);
        
        switch(op){
            case '+':
                System.out.println(m.add());
                break;
            case '-':
                System.out.println(m.sub());
                break;
            case '*':
                System.out.println(m.mul());
                break;
            case '/':
                System.out.println(m.div());
                break;
            default:
                System.out.print("Not Valid");
                break;
        }
    }
}


class MathOp{
    int n1, n2;
    public MathOp(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    
    int add(){
        return n1 + n2;
    }
    
    int sub(){
        return n1 - n2;
    }
    
    int mul(){
        return n1 * n2;
    }
    
    int div(){
        return n1 / n2;
    }
}