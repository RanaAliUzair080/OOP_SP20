/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Rana Alie
 */
public class Calculator {
    
    
    public static void Sum(int a , int b){
        System.out.println("Sum : "  + (a+b) );
    }
    public static void multiply(int a , int b){
        System.out.println("Mutliple : " + (a*b) );
    }
    public static void divide(int a , int b){
        System.out.println("Ans : " + (a/b));
    }
    public static void modulse(int a, int b){
        System.out.println("modulse : " + (a%b));
    }
    public static void sin(int a){
        System.out.println("Sin : " + Math.sin(a));
    }
    public static void cos(int a){
        System.out.println("Sin : " + Math.cos(a));
    }
    public static void tan(int a){
        System.out.println("Sin : " + Math.tan(a));
    }
}
