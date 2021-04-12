/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author Rana Alie
 */
public class Point {
    private int x;
    private int y;
    
    public Point(){
       x = 0 ;
       y = 0 ;
    }
    public Point(int a , int b){
       x = a ;
       y = b ;
    }
    public void setX (int a){
       x = a;
    }
    public void setY (int c){
    x= c;
    }
    public int getX(){
    return x;
    }
    public int getY(){
    return y;
    }
    public Point Add(Point Pa, Point Pb ){
    Point p_new = new Point(x+ Pa.x + Pb.x, y+ Pa.y + Pb.y);
    return p_new;
    }
    public void display(){
    System.out.println(x);
    System.out.println(y);
    }
}
