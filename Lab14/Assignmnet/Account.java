/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14;
import java.io.*;
/**
 *
 * @author Rana Alie
 */
public class Account implements Serializable{
    private int accountNumber;
    private double totalbalance;

    public Account() {
    }

    public Account(int accountNumber, double totalbalance) {
        this.accountNumber = accountNumber;
        this.totalbalance = totalbalance;
    }
    
    public double balanceInquiry(){
        return this.totalbalance;
    }

    public double getBalance() {
        return this.totalbalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.totalbalance = balance;
    }
    
    public void withdraw(double amount){
        if(this.totalbalance-amount<0){
            System.out.println("Wrong Entery \n No enough balance \n Try another");
        } else {
            totalbalance = totalbalance - amount;
        }
    }
    
    public void deposit(double amount){
        this.totalbalance = this.totalbalance + amount;
    }
    
    public void transfer(double amount,Account reciver){
        if(totalbalance-amount<=0){
            System.out.println("Wrong Entery \n No enough balance \n Try another");
        } else {
            totalbalance = totalbalance - amount;
            reciver.totalbalance = reciver.totalbalance + amount;
            System.out.println("Money successfully transferred to "+reciver.accountNumber);
        }
    }
}
