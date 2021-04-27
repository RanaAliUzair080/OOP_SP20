/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author Rana Alie
 */
public class BasePlusCommEmployee extends commissionEmployee{
    private double salary;

    public BasePlusCommEmployee(double salary, String FirstName, String LastName, String SSN, double grossSales, double commonRate) {
        super(FirstName, LastName, SSN, grossSales, commonRate);
        this.salary = salary;
    }
    public double earnings(){
        return super.earnings()+salary;
    }
    public void display(){
        super.display();
        System.out.println("Salary : "+salary);
    }   

}
