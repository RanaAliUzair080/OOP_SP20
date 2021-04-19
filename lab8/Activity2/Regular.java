/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author Rana Alie
 */
public class Regular extends Employee{
    private int basicPay ;
    
    public Regular(String name, String phone, String address, int allowance, int basicPay){
    super(name, phone, address, allowance);
    this.basicPay = basicPay ;
    }
    
    public void Display(){
        System.out.println("Name: " + name + "Phone Number: " + phone +"Address: " + address+ "Allowance: " + allowance + "Basic Pay: " + basicPay); 
    }
}

