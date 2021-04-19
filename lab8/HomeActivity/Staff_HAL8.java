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
public class Staff_HAL8 extends Employee_HAL8{
    private String title ;

    public Staff_HAL8(String title, String Office, String Salary, String name, String address, String phonr, String email) {
        super(Office, Salary, name, address, phonr, email);
        this.title = title;
    }

    public Staff_HAL8() {
        super();
        this.title = "pending";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public void display(){
        super.display();
        System.out.println("Title :"+title);
    }
    
}
