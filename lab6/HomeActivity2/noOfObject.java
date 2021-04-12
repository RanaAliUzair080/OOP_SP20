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
public class noOfObject {
    public static int objects ; 
    
    public noOfObject(){
        objects ++ ;
    }
    public static int getobjects(){
        return objects;
    }
    public static void deleteObject(noOfObject obj){
        obj = null ;
        objects -- ;
    }
}
