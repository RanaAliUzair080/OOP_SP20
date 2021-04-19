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
public class lab8_Activity2_Runner {
    public static void main(String []args){
    Regular regularObj = new Regular("Ahmed","090078601","Islamabad",15000,60000);
    regularObj.Display();
    Adhoc adhocObj = new Adhoc("Ali","03333333333","Rawalpindi",500,23,1500);
    adhocObj.Display();
}

}
