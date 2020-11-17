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
public class Circcle extends shape{
double radius;

    public Circcle() {
    }

    public Circcle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    

    @Override
    double getArea() {return (radius*radius*3.14);
    }
    

    @Override
    double getPerimeter() {
      return 2*radius*3.14;
      
    }

    @Override
    public String toString() {
        return "Circcle{" + "radius=" + radius + '}';
    }
    
    
}
