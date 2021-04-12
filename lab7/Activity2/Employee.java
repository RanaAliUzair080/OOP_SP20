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
public class Employee {
    private String name;
    private String fname;
    private Date birthdate;
    private Date hiredate;
    
    public Employee(){
        
    }
    public Employee(String n , String fn , Date datOfBirth , Date dateOfHire){
        name = n ;
        fname = fn ;
        this.birthdate = datOfBirth ;
        this.hiredate = dateOfHire ;
    }
    public void setName(String name){
        this.name = name ;
    }
    public void setfname(String fname){
        this.fname = fname ;
    }
    public void setBirthdate(Date b){
        this.birthdate = b ;
    }
    public void setHireDate(Date h){
        this.hiredate = h ;
    }
    public String getName(){
        return name ;
    }
    public String getfname(){
        return fname ;
    }
    public Date getBirthDate(){
        return birthdate ;
    }
    public Date getHireDate(){
        return hiredate ;
    }
     public void display()
    {
        System.out.println("Name: "+ name +" Father Name: "+ fname );
        birthdate.display();
        hiredate.display();
    }
}
