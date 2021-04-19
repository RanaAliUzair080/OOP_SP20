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
public class Student extends person {
    private int roll ;
    private int marks ;

    public Student(int roll, int marks) {
        this.roll = roll;
        this.marks = marks;
    }

    public Student(int roll, int marks, String name, String id, int phone) {
        super(name, id, phone);
        this.roll = roll;
        this.marks = marks;
    }

    public Student() {
        super();
        this.roll = 80 ;
        this.marks = 884 ;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    public void display(){
        super.display();
        System.out.println("Roll# :"+roll+"  MArks :"+marks);
    }
}
