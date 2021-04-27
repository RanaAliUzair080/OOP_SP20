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
public class Simple {
    protected double num1 ;
    protected double num2 ;

    public Simple(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Simple() {
        this.num1 = 0 ;
        this.num2 = 0 ;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public void add(){
        System.out.println("Sum : " + (num1+num2));
    }
    
    public void sub(){
        System.out.println("sub : " + (num1-num2));
    }
    
    public void mul(){
        System.out.println("mul : " + (num1*num2));
    }
    
    public void div(){
        System.out.println("div : " + (num1/num2));
    }
}
