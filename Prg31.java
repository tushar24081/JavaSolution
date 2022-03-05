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
public class Prg31 {
    public static void main(String[] args){
        int n=5, eid;
        String name;
        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter Employee ID: ");
            eid = sc.nextInt();
            System.out.println("Enter Employee Name: ");
            name = sc.next();
            emp[i] = new Employee();
            emp[i].set_data(eid, name);
        }
        
        for(int i=0; i<n; i++){
            emp[i].get_data();
        }
    }
}

class Employee{
    int emp_id;
    String emp_name;
    public void set_data(int emp_id, String emp_name){
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }
    public void get_data(){
        System.out.println(emp_id + "       " + emp_name);
    }
    
}
