/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Rana Alie
 */
public class Lab2_Home_Activity1_runner {
    public static void main(String[] args) {
        Student s1,s2;
        s1 = new Student();
        s1.age = 21;
        s1.gender = " Male";
        s1.name = " Uzair";
        s1.reg = 80;
        s1.display();
        
        s2 = new Student();
        s2.age = 22;
        s2.gender = " Female";
        s2.name = " jeny";
        s2.reg = 12;
        s2.display();
}
}