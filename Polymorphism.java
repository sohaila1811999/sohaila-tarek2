/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

import static java.awt.Color.red;
import static javafx.scene.paint.Color.color;

/**
 *
 * @author sohaila
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     shape A = new Rectangle(5,5);
     shape B = new Circcle(3);
     shape C = new Square(4);
    System.out.println("The area of rectangle =  "+ A.getArea() );
     
     System.out.println("The perimeter ="+ B.getPerimeter());
     
          System.out.println(C.toString());

    }
    
}
