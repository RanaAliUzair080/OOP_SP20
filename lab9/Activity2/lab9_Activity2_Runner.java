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
public class lab9_Activity2_Runner {
    public static void main(String args[]){
        BasePlusCommEmployee b;
        b = new BasePlusCommEmployee(25000,"ali", "ahmed", "25-kkn",100, 5.2);
        double earn = b.earnings();
        System.out.println("Earning of employee is" + earn);
    }

}
