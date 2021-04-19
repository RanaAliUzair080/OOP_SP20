/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;
import java.util.*;
/**
 *
 * @author Rana Alie
 */
public class Employee_HAL8 extends Parson{
    private String Office ;
    private String Salary ;
    
    Date di = new Date();

    public Employee_HAL8(String Office, String Salary, String name, String address, String phonr, String email) {
        super(name, address, phonr, email);
        this.Office = Office;
        this.Salary = Salary;
    }

    public Employee_HAL8() {
        super();
        this.Office = "main";
        this.Salary = "0000";
    }

    public String getOffice() {
        return Office;
    }

    public void setOffice(String Office) {
        this.Office = Office;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }

    public Date getDi() {
        return di;
    }

    public void setDi(Date di) {
        this.di = di;
    }
    
    public void display(){
        super.display();
        System.out.println("Employee Salary :" + Salary);
        System.out.println("Employee Office :" + Office);
        System.out.println("Employee dateHeierd :" + di);
    }
}
