/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author Rana Alie
 */
public class employeeRecord {
    private int emp_id ;
    private double salary ;
    
    public employeeRecord(int a , double b){
        emp_id = a ;
        salary = b ;
    }
    public void setEpm_id(int id){
        emp_id = id ;
    }
    public void setSalary(double sal){
        salary = sal;
    }
    public int getEmp_id(){
        return emp_id ;
    }
    public double getSalary(){
        return salary ;
    }
}
