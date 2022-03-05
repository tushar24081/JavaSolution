/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapracticalsppp;
import java.util.*;
/**
 *
 * @author TUSHAR
 */
public class Prg38 {
    public static void main(String[] args){
        int age, salary, n;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of STD you want: ");
        n = sc.nextInt();
        Employee2[] e = new Employee2[n];
        for(int i=0; i<n; i++){
            
            int hra, da, gs, it, ns, bsal, id;
            System.out.println("Enter Employee ID: ");
            id = sc.nextInt();
            System.out.println("Enter basic salary");
            bsal = sc.nextInt();
            
            hra = (bsal * 10) / 100;
            da = (bsal * 73) / 100;
            gs = bsal + hra + da;
            it = (gs * 30) / 100;
            ns = gs - it;
            
           
            e[i] = new Employee2();
            e[i].set_data(id, bsal, hra,da, gs, it, ns);
        }
        
        for(int i=0; i<n; i++){
            e[i].get_data();
        }
    }
}

class Employee2{
    int hra, da, gs, it, ns, id, bsal;
    public void set_data(int id, int bsal, int hra, int da, int gs, int it, int ns){
        this.hra = hra;
        this.da = da;
        this.gs = gs;
        this.it = it;
        this.ns = ns;
        this.id = id;
        this.bsal = bsal;
    }
    public void get_data(){
        System.out.print(id + " " + bsal + " " + hra + " " + da + " " + gs + " " + ns);
        System.out.println();
    }
    
}
