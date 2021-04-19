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
public class Parson {
    protected String name ;
    protected String address ;
    protected String phone ;
    protected String email ;

    public Parson(String name, String address, String phonr, String email) {
        this.name = name;
        this.address = address;
        this.phone = phonr;
        this.email = email;
    }

    public Parson() {
        this.address = "Lahore";
        this.name = "UZair";
        this.phone = "000000000";
        this.email = "koibhinai@gmaol.com";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void display(){
        System.out.println("Name : "+name+" Phone# :"+phone+"   Email :"+email+"    Address"+address);
    }
}
