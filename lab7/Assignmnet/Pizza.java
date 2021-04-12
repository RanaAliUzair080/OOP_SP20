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
public class Pizza {
    private String Size ;
    private double ches_top;
    private double pep_top;
    private double ham_top;

    public Pizza(String Size, double ches_top, double pep_top, double ham_top) {
        this.Size = Size;
        this.ches_top = ches_top;
        this.pep_top = pep_top;
        this.ham_top = ham_top;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public double getChes_top() {
        return ches_top;
    }

    public void setChes_top(double ches_top) {
        this.ches_top = ches_top;
    }

    public double getPep_top() {
        return pep_top;
    }

    public void setPep_top(double pep_top) {
        this.pep_top = pep_top;
    }

    public double getHam_top() {
        return ham_top;
    }

    public void setHam_top(double ham_top) {
        this.ham_top = ham_top;
    }
    public double calcCost(){
        double cost = 0 ;
        switch(Size){
            case "small" :
                //System.out.println("Total : "+ (10+(ham_top*2)+(pep_top*2)+(ches_top*2)) + "$");
                cost = (10+(ham_top*2)+(pep_top*2)+(ches_top*2));
                break ;
            case "medium":
                //System.out.println("Total : "+(12+(ham_top*2)+(pep_top*2)+(ches_top*2)) + "$");
                //break ;
                cost = (12+(ham_top*2)+(pep_top*2)+(ches_top*2));
                break ;
            case "large" :
                //System.out.println("Total : "+(14+(ham_top*2)+(pep_top*2)+(ches_top*2)) + "$");
                //break ;
                cost = (14+(ham_top*2)+(pep_top*2)+(ches_top*2));
                break ;
        }   
    return cost ;        
    }
    public void getDescription(){
        System.out.println("A  "+Size+"  Piza with  ");
        System.out.println("Chesse Toppings :" + ches_top);
        System.out.println("Peproni Toppings : " + pep_top);
        System.out.println("Ham Toppings : "+ ham_top);
    }
}
