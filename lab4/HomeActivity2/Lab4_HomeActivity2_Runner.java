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
public class Lab4_HomeActivity2_Runner {
    public static void main(String[] args){
        Account a1,a2;
        a1 = new Account();
        System.out.println("Current balance = " +a1.grtBalance());
        a1.Deposit(5000);
        a1.withdraw(6000);
        
        int b = a1.grtBalance();
        System.out.println(b);
        a2 = new Account(b);
        System.out.println("Current balance = " +a2.grtBalance());
        a2.Deposit(500);
        a2.withdraw(1000);
        
    }
}
