/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author Rana Alie
 */
public class Point {
    private double x_cord ;
    private double y_cord ;

    public Point(int x_cord, double y_cord) {
        this.x_cord = x_cord;
        this.y_cord = y_cord;
    }

    public double getX_cord() {
        return x_cord;
    }

    public void setX_cord(int x_cord) {
        this.x_cord = x_cord;
    }

    public double getY_cord() {
        return y_cord;
    }

    public void setY_cord(int y_cord) {
        this.y_cord = y_cord;
    }
    public void displayPoint(){
        System.out.println("X Cordrant :" + x_cord);
        System.out.println("y Cordrant :" + y_cord);
    }
    
}
