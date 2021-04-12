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
public class Lab7_Assignment_Runner {
    public static void main(String[] args){
        Pizza p1 = new Pizza("small",4,4,2);
        Pizza p2 = new Pizza("medium",4,4,2);
        p1.getDescription();
        System.out.println("your bill : "+ p1.calcCost());
        
        
        //
        
        PizzaOrder o = new PizzaOrder();
        o.setNumOfPizza(2);
        o.setP1(p1);
        o.setP2(p2);
        System.out.println("Ammount of order of "+o.getNumOfPizza()+" Pizza is " + o.calcTotal());
    }
}
