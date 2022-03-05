/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapracticalsppp;

/**
 *
 * @author TUSHAR
 */
public class Prg27 {
    
    public static void main(String[] args){
        Circle c = new Circle();
        Circle c1 = new Circle(10);
        System.out.println(c1.area());
        System.out.println(c1.circumference());
    }
    
}


class Circle{
    double radius, PI=3.14;
    public Circle(){
        System.out.println("Constructor without any arguments has been called");
    }
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double area(){
        return PI * radius * radius;
    }
    public double circumference(){
        return 2 * PI * radius;
    }
}