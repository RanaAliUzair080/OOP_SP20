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
public class Person {
    //private String name ;
    //private String status ;
    private Address p ;
    
    public Person(Address p){
        this.p = p ;
        //this.name = n ;
        //this.status = s ;
    }
    
    public void Display(){
        //System.out.println("Name : "+name );
        //System.out.println("Status : "+ status );
        System.out.println("House Number : "+p.gethouse() );
        System.out.println("Street : "+p.getStreet() );
        System.out.println("City code : "+p.gethouse() );
    }
}
