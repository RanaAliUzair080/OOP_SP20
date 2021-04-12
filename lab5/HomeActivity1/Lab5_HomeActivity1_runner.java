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
public class Lab5_HomeActivity1_runner {
    public static void main (String[] args){
        Distance d1 = new Distance(10 , 12 );
        Distance d2 = new Distance (15 , 15);
        Distance d3 =d1.ADD(d1, d2);
        d3.display();
    }  
}
