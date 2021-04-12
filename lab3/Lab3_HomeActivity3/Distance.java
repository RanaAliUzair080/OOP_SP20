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
public class Distance {
    public int feet;
    public int inches;
    
    public Distance(){
        feet = 1;
        inches = 1;
    }
    public Distance(int a , int b){
        feet = a;
        inches = b;
    }
    public void Display(){
        System.out.println("feets : " + feet + "Inches : " + inches);
    }
}
