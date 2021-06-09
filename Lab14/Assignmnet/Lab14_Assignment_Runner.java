/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14;
import java.io.*;
import java.util.*;
/**
 *
 * @author Rana Alie
 */
public class Lab14_Assignment_Runner {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        int arrayListNum;
        boolean status = true;
        System.out.println("Its your Own Bank.");
        while(status){
            
            System.out.println("1. to Add data");
            System.out.println("2. to Show All data");
            System.out.println("3. to Deposit Money");
            System.out.println("4. to Withdraw Money");
            System.out.println("5. to Transfer Money");
            System.out.println("6. to balance Inquiry");
            System.out.println("0. to Exist");
            System.out.print("Enter your choice : ");
            int choice = Input.nextInt();
            int accountNumber;
            double balance;
            double amount;
        switch (choice){
                case 1:
                    accounts.clear();
                    System.out.print("How many Accounts you want to add : ");
                    int total = Input.nextInt();
                    for(int i=0;i<total;i++){
                        System.out.print("Enter Account Number: ");
                        accountNumber = Input.nextInt();
                        System.out.print("Enter Balance: ");
                        balance = Input.nextDouble();
                        accounts.add(new Account(accountNumber,balance));
                    }
                    WriteAccounts(accounts);
                    break;
                case 2:
                    readAccounts(accounts);
                    break;
                case 3:
                    System.out.print("Enter Account Number : ");
                    accountNumber = Input.nextInt();
                    arrayListNum = findAccount(accountNumber);
                    System.out.print("Enter Deposit: ");
                    amount = Input.nextDouble();
                    accounts.get(arrayListNum-1).deposit(amount);
                    WriteAccounts(accounts);
                    break;
                case 4:
                    System.out.print("Enter Account Number : ");
                    accountNumber = Input.nextInt();
                    arrayListNum = findAccount(accountNumber);
                    System.out.print("Enter Amount : ");
                    amount = Input.nextDouble();
                    accounts.get(arrayListNum).withdraw(amount);
                    WriteAccounts(accounts);
                    break;
                case 5:
                    System.out.print("Enter Account Number : ");
                    int Account0 = Input.nextInt();
                    arrayListNum = findAccount(Account0);
                    System.out.print("Enter Amount : ");
                    int Account1 = Input.nextInt();
                    int Num = findAccount(Account1);
                    System.out.print("Enter Amount : ");
                    amount = Input.nextDouble();
                    accounts.get(arrayListNum).transfer(amount,accounts.get(Num));
                    WriteAccounts(accounts);
                    break;
                case 6:
                    System.out.print("Enter Account number: ");
                    accountNumber = Input.nextInt();
                    arrayListNum = findAccount(accountNumber);
                    System.out.println("Account Balance: "+accounts.get(arrayListNum-1).balanceInquiry());
                    break;
                case 0:
                    status = false;
                    break;
            }
        }
    }
    
    public static void WriteAccounts(ArrayList<Account> accounts){
        ObjectOutputStream Writer ;
        try{
            Writer = new ObjectOutputStream(new FileOutputStream("Account"));
            int i = 0;
            while(true){
                if(i==accounts.size()){
                    break;
                }
                Writer.writeObject(accounts.get(i));
                i++;
            }
            Writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readAccounts(ArrayList<Account> accounts){
        ObjectInputStream Reader = null;
        try {
            Reader = new ObjectInputStream(new FileInputStream("Account"));
            int i = 0;
            while (i<accounts.size()) {
                Account read = (Account) Reader.readObject();
                System.out.println();
                System.out.println("Account Number: " + read.getAccountNumber());
                System.out.println("Account Balance: " + read.getBalance());
                accounts.add(read);
                i++;
            }
        }catch (EOFException e){
            System.out.println("File Ended.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try{
                if(Reader!=null){
                    Reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static int findAccount(int account){
        Account temp = null;
        ObjectInputStream Reader = null;
        int i = 0;
        try{
            Reader = new ObjectInputStream(new FileInputStream("Account"));

            while(true){
                Account read = (Account) Reader.readObject();
                if(read.getAccountNumber()== account){
                    temp = read;
                    break;
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return i;
    }
}


