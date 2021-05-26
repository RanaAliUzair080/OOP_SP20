/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;


/**
 *
 * @author Rana Alie
 */
public class Lab11_Assgnmet_Runner {
    public static void main(String[] args) {
        
        Shape[] shapes = new Shape[50];
        shapes[0] = new Circle(8.1);
        shapes[1] = new Triangle(3.7,2.1);
        shapes[2] = new Rectangle(5.5,1.1);
        
        
        CalculateAreas totalShapes = new CalculateAreas(shapes);
        totalShapes.calArea();
        System.out.println(totalShapes.toString());
    }
}
