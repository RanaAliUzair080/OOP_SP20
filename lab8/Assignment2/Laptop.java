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
public class Laptop extends Computer{
    public String lenght ;
    public String width ;
    public String height ;
    public String weight ;

    public Laptop(String lenght, String width, String height, String weight, String wordSize, String memorySize, String storageSize, String speed) {
        super(wordSize, memorySize, storageSize, speed);
        this.lenght = lenght;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public Laptop() {
        super();
        this.lenght = "00";
        this.width = "00";
        this.height = "00";
        this.weight = "00";
    }

    public String getLenght() {
        return lenght;
    }

    public void setLenght(String lenght) {
        this.lenght = lenght;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
    public void display(){
        super.display();
        System.out.println("Lenght inches : "+ lenght);
        System.out.println("width iches : "+ width);
        System.out.println("height inches : "+ height);
        System.out.println("weight inches : "+ weight);
    }
    
}
