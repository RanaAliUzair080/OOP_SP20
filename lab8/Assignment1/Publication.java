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
public class Publication {
    protected String title ;
    protected String price ;

    public Publication(String title, String price) {
        this.title = title;
        this.price = price;
    }

    public Publication() {
        this.price = "000";
        this.title = "non";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    public void display(){
        System.out.println("Title : "+title + "  Price : " +price);
    }
    
}
