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
public class Book {
    private String BookName ;
    private String publisher;
    private Person p ;
    
    public Book(Person a , String b ,String p){
        this.p = a ;
        this.BookName = b ;
        this.publisher = p ;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }
    public void Displaybook(){
        p.Display();
        System.out.println("Book name :"+ BookName);
        System.out.println("Publisher :" + publisher);
    }
}
