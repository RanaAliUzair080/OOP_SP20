/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author Rana Alie
 */
public class Circle extends Shape{

    public Circle(int lines, String penColor, boolean fillColor) {
        super(lines, penColor, fillColor);
    }
    @Override
    public void draw(){
        System.out.println("Draw Circle..");
        System.out.println("Lines : "+lines +"      PenColor : " +penColor +"      FillColor : "+fillColor);
    }
}
