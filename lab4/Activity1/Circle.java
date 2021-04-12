/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author cui
 */
public class Circle {
    private int radius;
    
    public Circle(){
        radius = 7;
    }
    public Circle(int r){
        radius = r;
    }
    public void setRadius(int r){
        radius = r;
    }
    public int getradius(){
        return radius;
    }
    public void display(){
        System.out.println("radius = " + radius);
    }
    public void CalCercum(){
        double c = 3.14*radius*radius;
        System.out.println("Cercumferance = " + c);
    }
}
