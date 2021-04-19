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
public class Adhoc extends Employee{
    private int numberOfWorkingDays;
    private int wage;
    
    public Adhoc(String name, String phone, String address, int allowance, int numberOfWorkingDays, int wage) {
    super(name, phone, address, allowance);
    this.numberOfWorkingDays = numberOfWorkingDays;
    this.wage = wage;
    }
    
    public void Display() {
        System.out.println("Name: " + name + "Phone Number: " + phone +"Address: " + address+ "Allowance: " + allowance + "Number Of Working Days: " +numberOfWorkingDays + "Wage: " + wage);
    }
}

