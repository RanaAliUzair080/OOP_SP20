/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author Rana Alie
 */
public class ConflictingInterfaceTest implements NewInterface1,NewInterface2{
    public void show(){
        System.out.println("Vlaue of pi in Interface_1: "+NewInterface1.pi);
        System.out.println("Vlaue of pi in Interface_2: "+NewInterface2.pi);
        //Here we can differentiate the variables by the dot operator.
        // Although A single implementation of the method is enough for both interfaces.
    }
}
