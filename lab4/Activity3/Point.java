/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Rana Alie
 */
public class Point {
    private int x ;
    private int y ;
    
    public Point(){
        x = 0 ;
        y = 0 ;
    }
    public Point(int a ,int b){
        x = a ;
        y = b ;
    }
    public void setX(int e){
        x = e ;
    }
    public void setY(int f){
        y = f ;
    }
    public int getX(){
        return x ;
    }
    public int getY(){
        return y ;
    }
    public void display(){
        System.out.println("X cordinate = " + x + "Y cordinate = " + y);
    }
    public void move(int x1 , int y1){
        x = x+x1;
        y = y+y1;
        System.out.println("X after moving  =" + x  + "Y after moving = " + y);
    }
}
