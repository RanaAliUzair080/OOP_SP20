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
public class Comedy extends Movie{

    public Comedy(String rating, int ID, String tittle) {
        super(rating, ID, tittle);
    }

    public Comedy() {
        super();
    }

    @Override
    public String toString() {
        return "Rating : " +super.getRating() + "       ID : "+super.getID()+"      Title : "+super.getTittle();
    }
    
    @Override
    public void calcLateFees(int a){
        System.out.println(a*2);
    }
    
}
