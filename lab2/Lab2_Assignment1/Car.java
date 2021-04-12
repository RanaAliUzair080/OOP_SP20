/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Rana Alie
 */
public class Car {
    public String colour ;
    public String reg_num;
    public String model;
    public int action;
    
    void display(){
        System.out.println("car   " + colour +"number  "+reg_num +"Model   " + model);
    }
    void Action (int a){
        switch(a){
            case 8:
                 System.out.println("Moving forwerd.....   ");
                 break;
            case 4:
                 System.out.println("Left door open.....   ");
                 break;
            case 6:
                 System.out.println("Right door open .....   ");
                 break;
            case 2:
                 System.out.println("Reversing back.....   ");
                 break;
    }
}
}