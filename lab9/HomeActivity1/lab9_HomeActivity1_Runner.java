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
public class lab9_HomeActivity1_Runner {
    public static void main(String[] args){
        Action a1 = new Action("A",15,"Don");
        Comedy c1 = new Comedy("C",26,"Mask");
        Drama d1  = new Drama("D",38,"ishaq");
        
        System.out.println("Movie List :");
        System.out.println(a1);
        System.out.println(c1);
        System.out.println(d1);
        
        System.out.println();
        System.out.println("Checking equality of 2 movies");
        c1.equal(a1);    
    }
}
