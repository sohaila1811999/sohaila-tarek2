/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author sohaila
 */
public class Rectangle extends shape {
     double width;
    double length;
   public Rectangle(){}

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
   
          
double getWidth(){return width;}
void setWidth(double width){}
double getLength(){return length;}
void setLength(double length){}

    @Override
    double getArea() {
      return length*width;
    }

    @Override
    double getPerimeter() {
return 2*(length+ width);    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }

  


}
