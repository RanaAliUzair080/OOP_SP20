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
public class Book {
    private String Author;
    private String[] chapterNames = new String[100];
    
    public Book(){
        Author = "No value yet";
        chapterNames = new String[] {"not vlaue yet"};
    }
    public Book(String a , String[] Array){
        Author = a ;
        chapterNames = Array ;
    }
    public void compareBooks(Book a){
        if(Author == a.Author)
        System.out.println("Same Author");
        else
        System.out.println("Diffrent Author");
    }
    public void compareChapterNames(Book a){
        if(chapterNames.length == a.chapterNames.length){
            System.out.println("Same Number of chapters");
        }
        else if(chapterNames.length <= a.chapterNames.length){
            System.out.println("book you enter has more chapter ");
        }
        else
            System.out.println("book you enter has less chapter ");
            
    }
}

