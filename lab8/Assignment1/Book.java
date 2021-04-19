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
public class Book extends Publication{
    private int pageCount ;

    public Book(int pageCount, String title, String price) {
        super(title, price);
        this.pageCount = pageCount;
    }

    public Book() {
        super();
        this.pageCount = 0;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    
    public void display(){
        super.display();
        System.out.println("PageCont : " + pageCount);
    }
    
}
