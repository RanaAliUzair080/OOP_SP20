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
public class Complax {
    private double real;
    private double imag;
    
    public Complax(){
        real = 0 ;
        imag = 0;
    }
    public Complax(double r , double im){
        real = r ;
        imag = im;
    }
    public Complax Add (Complax b){
        Complax c_new = new Complax(real + b.real , imag + b.imag);
        return c_new ;
    }
    public void display(){
        System.out.println(real + imag );
    }
}
