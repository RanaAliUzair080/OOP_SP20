/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Rana Alie
 */
public class HotDogStand {
    private int ID;
    private int numOfHotDogSale;
    
    public HotDogStand(){
        ID = 0;
        numOfHotDogSale = 0;
    }
    public HotDogStand(int a , int b ){
        ID = a;
        numOfHotDogSale = b;
    }
    public void justSold(){
        numOfHotDogSale++;
        System.out.println("An other  HotDog is sailed at " + ID);
    }
    public void display(){
        System.out.println("Store ID    :" + ID + "  Has Sale :  " + numOfHotDogSale + "    HotDogs");
    }
}
