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
public class Lab7_HomeActivity2_Runner {
    public static void main(String[] args){
        Address ad = new Address(3,3,3) ;
        Person p = new Person(ad);
        Book b = new Book(p , "OOP" , "Ali");
        b.Displaybook();
    }
}
