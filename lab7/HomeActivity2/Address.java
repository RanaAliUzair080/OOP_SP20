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
public class Address {
    private int Street_num ;
    private int House_num;
    private int city_code ;
    
    public Address(){
        this.House_num = 0 ;
        this.Street_num = 0 ;
        this.city_code = 0 ;
    }
    public Address(int a , int b ,int c){
        this.House_num = a ;
        this.Street_num = b ;
        this.city_code = c ;
    }
    public int gethouse(){
        return House_num ;
    }
    public int getStreet(){
        return Street_num;
    }
    public int getCity(){
        return city_code;
    }
    public void setHouse(int house){
        this.House_num = house ;
    }
    public void setStreet(int street){
        this.Street_num = street ;
    }
    public void setCity(int city){
        this.city_code = city ;
    }
}
