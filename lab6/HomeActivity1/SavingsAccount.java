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
public class SavingsAccount {
    public static int annualInterestRate ;
    private int savingsBalance ;
    
    public SavingsAccount(int balance){
        savingsBalance = balance ;
    }
    
    public void calculateMonthlyInterest(){
        System.out.print("Monthly Interest : ");
        System.out.println(annualInterestRate * savingsBalance/ 12);
    }
    public static void modifyInterestRate(int rate){
        annualInterestRate = rate ;
    }
}
