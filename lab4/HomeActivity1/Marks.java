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
public class Marks {
   private int num1 ;
    private int num2 ;
    private int num3 ;
    
    public Marks(){
        num1 = 33;
        num2 = 33;
        num3 = 33;
    }
    public Marks(int a ,int b , int c){
        num1 = a;
        num2 = b;
        num3 = c;
    }
    public void set(int d , int e , int f){
        num1 = d ;
        num2 = e ;
        num3 = f ;
    }
    public void get(){
        System.out.println("Numbers Are ...." + num1 + "," + num2 + "," + num3 + ".");
    } 
}
