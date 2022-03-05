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
public class Prg37 {
    public static void main(String[] args){
        int age, salary, n;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of STD you want: ");
        n = sc.nextInt();
        Person[] p = new Person[n];
        for(int i=0; i<n; i++){
            
            System.out.println("Enter Person Name: ");
            name = sc.next();
            System.out.println("Enter Person Age: ");
            age = sc.nextInt();
            System.out.println("Enter Person Salary: ");
            salary = sc.nextInt();
           
            p[i] = new Person();
            p[i].set_data(name, age, salary);
        }
        
        for(int i=0; i<n; i++){
            p[i].get_data();
        }
    }
}

class Person{
    int age, salary;
    String name;
    public void set_data(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
        
    }
    public void get_data(){
        System.out.print(name + " " + age + " " + salary + " " );
        System.out.println();
    }
    
}
