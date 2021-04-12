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
public class Marks {
     public int num1;
    public int num2;
    public int num3;
    
    public Marks(){
        num1 = 85;
        num2 = 65;
        num3 = 98;
    }
    public Marks(int a , int b , int c){
        num1 = a;
        num2 = b;
        num3 = c;
    }
    public void calculate(){
        int sum = num1+num2+num3;
        System.out.println("Sum is :" + sum);
    }
}
