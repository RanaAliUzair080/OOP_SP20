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
public class Rectangle {
    private int lenght , width;
    
    public Rectangle(){
        lenght = 5 ;
        width = 2;
    }
    public Rectangle(int a , int b){
        lenght = a ;
        width = b ;
    }
    public void setlenght(int l){
        lenght = l ;
    }
    public void setwidht(int w){
        width = w;
    }
    public int getLenght(){
        return lenght;
    }
    public int getwidht(){
        return width ;
    }
    public int Area(){
        return(lenght*width);
    }
}
