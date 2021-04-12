/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import java.util.*;
/**
 *
 * @author Rana Alie
 */
public class Lab3_Assignment1_Runner {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Marks m1,m2,m3;
        m3 = new Marks();
        m3.calculate();
        m1 = new Marks(2,2,2);
        m1.calculate();
        m2 = new Marks();
        System.out.println("Enter Three numbers :  ");
        m2.num1 = in.nextInt();
        m2.num2 = in.nextInt();
        m2.num3 = in.nextInt();
        m2.calculate();
        
    }
}
