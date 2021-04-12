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
public class Lab6_Activity1_Runner {
    public static void main(String[]args){
    ABC obj1 = new ABC();
    ABC obj2 = new ABC();
    
    obj1.Var1 = 88 ;
    obj1.Var2 = "I am Object1";
    obj2.Var2 = "I am object2";
    obj2.Var1 = 666;
    System.out.println("ob1 integer:"+obj1.Var1);
    System.out.println("ob1 String:"+obj1.Var2);
    System.out.println("ob2 integer:"+obj2.Var1);
    System.out.println("ob2 STring:"+obj2.Var2);

    }
}