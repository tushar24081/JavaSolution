/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapracticalsppp;

/**
 *
 * @author TUSHAR
 */
public class Prg28 {
    
    public static void main(String[] args){
        Sphere s = new Sphere();
        Sphere s1 = new Sphere(10);
        System.out.println(s1.area());
        
    }
    
}


class Sphere{
    double radius, PI=3.14;
    public Sphere(){
        System.out.println("Constructor without any arguments has been called");
    }
    public Sphere(double radius){
        this.radius = radius;
    }
    
    public double area(){
        return 4*PI*radius*radius;
    }
    
}