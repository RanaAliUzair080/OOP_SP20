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
public class EmplayeeTask implements RegisterForExams{
    private String name;
    private String date;
    private int salary;
    public EmplayeeTask(){
        name = null;
        date = null;
        salary = 0;
    }
    public EmplayeeTask(String name,String date,int salary){
        this.name = name;
        this.date = date;
        this.salary = salary;
    }
    @Override
    public void register() {
        // TODO Auto-generated method stub
        System.out.println("Name :" + name + "\nsalary :" + salary + "\nEmployee reistered on date :" + date);
    }

}
