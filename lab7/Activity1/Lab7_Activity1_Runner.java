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
public class Lab7_Activity1_Runner {
    public static void main(String[] args){
        studentRecord s = new studentRecord("MBA");
        employeeRecord e = new employeeRecord(111, 50000);
        Manager m1 = new Manager("financeManager" , 5000, e, s ) ;
        m1.display();   
    }
}
