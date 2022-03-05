/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapracticalsppp;

/**
 *
 * @author TUSHAR
 */
public class Prg26 {
    
    public static void main(String[] args){
        Square s = new Square();
        Square s1 = new Square(10);
        System.out.println(s1.area());
        System.out.println(s1.perimeter());
    }
    
}


class Square{
    double length, breadth;
    public Square(){
        System.out.println("Constructor without any arguments has been called");
    }
    public Square(double length){
        this.length = length;
    }
    
    public double area(){
        return length*length;
    }
    public double perimeter(){
        return 4 * length;
    }
}