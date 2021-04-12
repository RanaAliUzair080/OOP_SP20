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
public class Account {
    private int balance ;
    
    public Account(){
        balance = 500 ;
    }
    public Account(int a){
        balance = a ;
    }
    public void Deposit(int d){
        balance = balance + d ;
        System.out.println("Your Curennt Balance = " + balance);
    }
    public void withdraw(int w){
        if (w <= 0){
            int a = balance - w;
            System.out.println("You withdraw = " + w  + "your current balance = " + a);
        }
        else 
            System.out.println("Incifiiant balance.......");
    }
    public int grtBalance(){
        return balance;
    }
}
