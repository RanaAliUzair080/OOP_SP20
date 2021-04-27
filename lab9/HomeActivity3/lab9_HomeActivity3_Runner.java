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
public class lab9_HomeActivity3_Runner {
    public static void main(String[] args){
        Triangle tri = new Triangle(12,"Red",true);
        tri.draw();
        
        Circle cri = new Circle(45,"Blue",true);
        cri.draw();
        
        Square suq = new Square(66,"Yellow",false);
        suq.draw();
    }
}
