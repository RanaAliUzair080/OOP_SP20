/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Rana Alie
 */
public class Circle {
    public int radius;
    //
    public Circle(){
        radius = 2;
    }
    public Circle(int a , double b ){
        radius = a;
       double PI = b;
    }
    public double Circumference(int a , double b){
        return (2*a*b);
    }
}
