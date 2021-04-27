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
public class Triangle extends Shape{

    public Triangle(int lines, String penColor, boolean fillColor) {
        super(lines, penColor, fillColor);
    }

    @Override
    public void draw(){
        System.out.println("Draw Triangle..");
        System.out.println("Lines : "+lines +"      PenColor : " +penColor +"      FillColor : "+fillColor);
    }
}
