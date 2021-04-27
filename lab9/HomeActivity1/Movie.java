/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author Rana Alie
 */
public class Movie {
    protected String rating ;
    protected int ID ;
    protected String tittle ;

    public Movie(String rating, int ID, String tittle) {
        this.rating = rating;
        this.ID = ID;
        this.tittle = tittle;
    }

    public Movie() {
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    public void calcLateFees(int a){
        System.out.println(a*2);
    }
    public void equal(Movie a){
        if(this.ID != a.ID){
        } else {
            System.out.println("Movies are Same ");
        }
         System.out.println("Movies are not Same ") ;
    }
    
}
