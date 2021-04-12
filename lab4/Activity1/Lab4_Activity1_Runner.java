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
public class Lab4_Activity1_Runner {
    public static void main(String[] args){
        Circle c1;
        c1 = new Circle();
        c1.setRadius(10);
        c1.CalCercum();
        
        int r = c1.getradius();
        
        Circle c2;
        c2 = new Circle();
        c2.setRadius(r);
        c2.CalCercum();
    }
}
