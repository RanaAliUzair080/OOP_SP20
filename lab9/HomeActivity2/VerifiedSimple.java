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
public class VerifiedSimple extends Simple{
    private double nu1 ;
    private double nu2 ;

    public VerifiedSimple(double num1, double num2) {
        super();
        this.nu1 = num1;
        this.nu2 = num2;
    }

    public VerifiedSimple() {
    }
    
    @Override
    public void add(){
        if(nu1> 0 && nu2 >0){
            super.add();
        }
        else
            System.out.println("Error.....!! Number is less then 0");
    }
    
    @Override
    public void sub(){
        if(nu1> 0 && nu2 >0){
            super.sub();
        }
        else
            System.out.println("Error.....!! Number is less then 0");
    }
    
    @Override
    public void mul(){
        if(nu1> 0 && nu2 >0){
            super.mul();
        }
        else
            System.out.println("Error.....!! Number is less then 0");
    }
    
    @Override
    public void div(){
        if(nu1> 0 && nu2 >0){
            super.div();
        }
        else
            System.out.println("Error.....!! Number is less then 0");
    }
}
