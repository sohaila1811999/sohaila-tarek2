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
public abstract class shape {
    String color;
    boolean filled;

    public shape() {
    }

    public shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    String getColor(){return color;}
    void setColor(String color){}
    boolean isFiled(){return filled;}
    void setFilled(boolean filled){}
     abstract double getArea();
     abstract double getPerimeter();

    @Override
   public  String toString() {
        return "shape{" + "color=" + color + ", filled=" + filled + '}';
    }

}
