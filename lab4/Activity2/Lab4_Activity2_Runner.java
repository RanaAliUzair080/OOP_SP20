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
public class Lab4_Activity2_Runner {
    public static void main (String[] args){
     Rectangle rect ;
        rect = new Rectangle();
        rect.setlenght(10);
        rect.setwidht(5);
        System.out.println("Area = " + rect.Area());
        System.out.println("Cuurent lenght = " + rect.getLenght());
        
    }
}
