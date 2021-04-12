/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Rana Alie
 */
public class La6_HomeActivity2_Runner {
    public static void main(String[] args){
        noOfObject o1 ,o2 ,o3 ;
        o1 = new noOfObject();
        o2 = new noOfObject();
        o3 = new noOfObject();
        System.out.println(noOfObject.objects);
        noOfObject.deleteObject(o3);
        System.out.println(noOfObject.objects);
        
        
    }
}
