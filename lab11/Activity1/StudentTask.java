/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author Rana Alie
 */
public class StudentTask implements RegisterForExams{
        private String name;
        private int age;
        private double gpa;
    public StudentTask(){
        name = null;
        age = 0;
        gpa = 0;
    }
    public StudentTask(String name,int age,double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    @Override
    public void register() {
        // TODO Auto-generated method stub
        System.out.println("Student name :" + name + "\nGpa :" + gpa + "\nAge :" + age);
    }

}
