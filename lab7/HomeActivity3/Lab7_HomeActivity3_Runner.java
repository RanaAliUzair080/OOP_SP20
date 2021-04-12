/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author Rana Alie
 */
public class Lab7_HomeActivity3_Runner {
    public static void main(String[] args){
        Point p1 = new Point(4,5);
        Point p2 = new Point(2,6);
        Line L1 = new Line(p1,p2);
        Line L2 = new Line(p2,p1);
        L1.getLenght();
        L2.getLenght();
    }
}
