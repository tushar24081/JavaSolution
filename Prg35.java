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
public class Prg35 {
    public static void main(String[] args){
        int n, sid, m1, m2, m3;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of STD you want: ");
        n = sc.nextInt();
        Student[] std = new Student[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter Student ID: ");
            sid = sc.nextInt();
            System.out.println("Enter Student Name: ");
            name = sc.next();
            System.out.println("Enter Marks 1: ");
            m1 = sc.nextInt();
            System.out.println("Enter Marks 2: ");
            m2 = sc.nextInt();
            System.out.println("Enter Marks 3 ");
            m3 = sc.nextInt();
            
            std[i] = new Student();
            std[i].set_data(sid, name, m1, m2, m3);
        }
        
        for(int i=0; i<n; i++){
            std[i].get_data();
        }
    }
}

class Student{
    int std_id, m1, m2, m3;
    String std_name;
    public void set_data(int std_id, String std_name, int m1, int m2, int m3){
        this.std_id = std_id;
        this.std_name = std_name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    public void get_data(){
        System.out.print(std_id + "  " + std_name + " " + m1 + " " + m2 + " " + m3);
        System.out.println();
    }
    
}
