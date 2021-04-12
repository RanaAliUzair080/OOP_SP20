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
public class Lab5_Activity2_runner {
    public static void main(String[] args){
        Complax c1 = new Complax(12,2.5);
        Complax c2 = new Complax(24,3.2);
        Complax c3 = new Complax();
        c3 = c2.Add(c1);
        c3.display();
    }
}
