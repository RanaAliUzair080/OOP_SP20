/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author Rana Alie
 */
public class Lab5_HomeAcivity2_runner {
    public static void main(String[] args){
        Book b1,b2;
        b1 = new Book("ali" , new String[]{"c1","c2","c3"});
        b2 = new Book("ali" , new String[]{"c1","c2","c3","c1"});
        b2.compareBooks(b1);
        b1.compareChapterNames(b2);
    }
}
