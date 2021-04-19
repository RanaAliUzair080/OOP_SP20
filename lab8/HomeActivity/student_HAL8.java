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
public class student_HAL8 extends Parson{
    private String status ;

    public student_HAL8(String status, String name, String address, String phonr, String email) {
        super(name, address, phonr, email);
        this.status = status;
    }

    public student_HAL8() {
        super();
        this.status = "PAss";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void display(){
        super.display();
        System.out.println("Status :" + status);
    }    
}
