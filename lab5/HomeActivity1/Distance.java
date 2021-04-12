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
public class Distance {
    private int feet ; 
    private int inches ; 
    
    public Distance(){
        feet = 0 ;
        inches = 0 ;
    }
    public Distance (int a , int b){
        feet = a ;
        inches = b;
    }
    public void setFeet(int f){
        feet = f ;
    }
    public void setInches(int in){
        inches = in ;
    }
    public void getFeet(){
        System.out.println("feet : " + feet);
    }
    public void getinches(){
        System.out.println("Inches : " + inches);
    }
    public Distance ADD (Distance a , Distance b){
        Distance ad = new Distance(a.feet+b.feet , a.inches + b.inches);
        return ad;
    }
    public void display(){
    System.out.println(feet);
    System.out.println(inches);
    }
}
