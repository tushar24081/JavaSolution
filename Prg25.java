/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapracticalsppp;

/**
 *
 * @author TUSHAR
 */
public class Prg25 {
    
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        Rectangle r1 = new Rectangle(10, 20);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
    }
    
}


class Rectangle{
    double length, breadth;
    public Rectangle(){
        System.out.println("Constructor without any arguments has been called");
    }
    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2 * (length + breadth);
    }
}