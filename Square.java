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
public class Square extends Rectangle{
    double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, double width, double length) {
        super(width, length);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }

    

    @Override
    double getPerimeter() {
        return 4*side; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    double getArea() {
        return side*side; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
