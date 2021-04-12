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
public class Student {
    private String name;
    private int[] Result_Array = new int[5];
    
    public Student(String n, int[] Result_arr){
        
        name = n;
        Result_Array = Result_arr;
        
    }
    
    public int avg(){
        int total = 0;
        System.out.println("Average of Student: " + name);
        for(int i = 0; i<5;i++){
            total = total + Result_Array[i];
        }
        
        return(total/5);
    }
}
