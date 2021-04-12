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
public class Manager {
    private String tittle ;
    private double dues ;
    private employeeRecord emp ;
    private studentRecord stu ;
    
        
    public Manager(String t , double d ,employeeRecord e , studentRecord st ){
        tittle = t ;
        dues = d ;
        emp = e ;
        stu = st ;
    }
    public Manager(){
        
    }
    public void display(){
        System.out.println("Title is : " + tittle); 
        System.out.println("Dues are : " + dues);
           
        System.out.println("Emplyoyee record is as under: ");
        System.out.println("EmployeeId is : " + emp. getEmp_id());
        System.out.println("EmployeeId is : " + emp. getSalary());
           
        System.out.println("Student record is as under: " );
        System.out.println("Degree is : " + stu.getDegre());
    }
}
