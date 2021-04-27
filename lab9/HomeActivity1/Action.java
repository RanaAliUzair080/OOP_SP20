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
public class Action extends Movie{

    public Action(String rating, int ID, String tittle) {
        super(rating, ID, tittle);
    }

    public Action() {
        super();
    }

    @Override
    public String toString() {
        return "Rating : " +super.getRating() + "       ID : "+super.getID()+"      Title : "+super.getTittle();
    }
   
    @Override
    public void calcLateFees(int a){
        System.out.println(a*3);
    }
     
}