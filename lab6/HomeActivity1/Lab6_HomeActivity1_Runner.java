/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Rana Alie
 */
public class Lab6_HomeActivity1_Runner {
    public static void main(String[] args){
      SavingsAccount saver1 , saver2 ;
      saver1 = new SavingsAccount(2000);
      saver2 = new SavingsAccount(3000);
      saver1.modifyInterestRate(3);
      saver1.calculateMonthlyInterest();
      
      System.out.println("2nd Saver ---");
      saver2.modifyInterestRate(4);
      saver2.calculateMonthlyInterest();
      
    } 
    
    
}
