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
public class Lab4_Activity3_Runner {
    public static void main(String[] args){
        Point p1;
        p1 = new Point();
        p1.setX(10);
        p1.setY(7);
        p1.display();
        
        Point p2;
        p2 = new Point();
        p2.move(2, 4);
        p2.display();
    }
}
