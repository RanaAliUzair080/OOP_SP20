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
public abstract class Shape {
    protected int lines;
    protected String penColor;
    protected boolean fillColor ;

    public Shape(int lines, String penColor, boolean fillColor) {
        this.lines = lines;
        this.penColor = penColor;
        this.fillColor = fillColor;
    }
    
    public abstract void draw();
}
