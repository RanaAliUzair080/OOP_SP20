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
public class Lab8_Assignment2_Runner {
    public static void main(String[] args){
        Computer c = new Computer("16 bit","8 GB","999 GB","100 Mhtz");
        System.out.println("Computer:");
        c.display();
        System.out.println();
        
        
        Laptop la = new Laptop("50","25","50","12 kg","16 bit","8 GB","999 GB","100 Mhtz");
        System.out.println("Laptop:");
        la.display();
    }
}
