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
public class person {
    protected String name ;
    protected String id ;
    protected int phone ;
    
    public person() {
        this.id = "sp20-bse-080";
        this.name = "rana uzair";
        this.phone = 02302 ;
    }

    public person(String name, String id, int phone) {
        this.name = name;
        this.id = id;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    public void display (){
        System.out.println("Name : " + name + " ID : " + id + " Phone : " + phone ) ;
    }
}
