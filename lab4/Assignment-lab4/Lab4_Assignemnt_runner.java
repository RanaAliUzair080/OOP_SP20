/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Rana Alie
 */
public class Lab4_Assignemnt_runner {
    public static void main(String[] args ){
        HotDogStand st1 , st2 , st3;
        st1 = new HotDogStand(1,88);
        st2 = new HotDogStand(2,554);
        st3 = new HotDogStand(3,358);
        st1.display();
        st2.display();
        st3.display();
        
        st1.justSold();
        st2.justSold();
        st3.justSold();
        
        st1.display();
        st2.display();
        st3.display();
    }
}
