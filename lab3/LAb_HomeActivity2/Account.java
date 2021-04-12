/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Rana Alie
 */
public class Account {
    public double balance;
    
    public Account(){
        balance=0;
    }
     public Account(int a , int b ){
        balance=a;
    }
     public void deposit(double depositAmount){                                                                
         if (depositAmount > 0.0) // if the depositAmount is valid     
            balance = balance + depositAmount; // add it to the balance
    }
     public void withdraw (double withdraw){                                                                
         if (withdraw > 0.0) // if the depositAmount is valid     
            balance = balance - withdraw; // add it to the balance
    }
      public double getBalance()           
      {                                    
         return balance;                   
     } 
}
