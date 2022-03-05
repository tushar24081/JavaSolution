/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapracticalsppp;

/**
 *
 * @author TUSHAR
 */
public class Prg29 {
     public static void main(String[] args){
        System.out.println("FOR RECTANGLE");
        Rectangle2 r = new Rectangle2();
        Rectangle2 r2 = new Rectangle2(10, 20);
        System.out.println(r2.area());
        System.out.println(r2.perimeter());
        
        System.out.println("FOR SQUARE");
        Square2 s = new Square2();
        Square2 s2 = new Square2(10);
        System.out.println(s2.area());
        System.out.println(s2.perimeter());
        
        System.out.println("FOR TRIANGLE");
        Triangle t = new Triangle();
        Triangle t2 = new Triangle(10, 20, 30);
        System.out.println(t2.area());
        System.out.println(t2.perimeter());
    }
}
class Rectangle2{
    double length, breadth;
    public Rectangle2(){
        System.out.println("Constructor without any arguments has been called");
    }
    public Rectangle2(double length, double breadth){
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


class Square2{
    double length;
    public Square2(){
        System.out.println("Constructor without any arguments has been called");
    }
    public Square2(double length){
        this.length = length;
    }
    
    public double area(){
        return length*length;
    }
    public double perimeter(){
        return 4 * length;
    }
}


class Triangle{
    double height, width, top;
    public Triangle(){
        System.out.println("Constructor without any arguments has been called");
    }
    public Triangle(double height,double width, double top ){
        this.height = height;
        this.width = width;
        this.top = top;
    }
    
    public double area(){
        return (height*width)/2;
    }
    public double perimeter(){
        return (top + height + width);
    }
}



