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
public class Lab5_Activity1_runner {
    public static void main(String[] args){
        ObjectPass p;
        p = new ObjectPass();
        p.value = 10 ;
        System.out.println("Before calling : " + p.value);
        ObjectPass.increment(p);
        System.out.println("Before calling : " + p.value);
    }
}
