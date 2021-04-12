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
public class Lab7_Activity2_runner {
     public static void main(String[] args){
        Date b = new Date (31,2,1990);
        Date h = new Date (5,6,2016);
        Employee e1 ;
        e1 = new  Employee("Ali" , "Hameed" , b,h);
        e1.display();
 }
}
