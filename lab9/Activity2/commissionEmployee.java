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
public class commissionEmployee {
    protected String FirstName;
    protected String LastName;
    protected String SSN;
    protected double grossSales;
    protected double commonRate;
    
    public commissionEmployee(){
        FirstName="Nagina";
        LastName="Nazar";
        SSN="S003";
        grossSales=1234.1;
        commonRate=12.5;
    }

    public commissionEmployee(String FirstName, String LastName, String SSN, double grossSales, double commonRate) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.SSN = SSN;
        this.grossSales = grossSales;
        this.commonRate = commonRate;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommonRate() {
        return commonRate;
    }

    public void setCommonRate(double commonRate) {
        this.commonRate = commonRate;
    }
    public double earnings(){
        return grossSales*commonRate;
    }
    public void display(){
        System.out.println("first name:"+FirstName+",last name:"+LastName+"SSN:"+SSN+" Gross Sale:"+grossSales+" and commonRate:"+commonRate);
    }

}