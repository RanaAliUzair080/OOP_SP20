/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;


public class Time {
    public int hour ;
    public int mint ;
    public int sec ;
    public int date ; 
    public String day ;
    
    
    public void display(){
        System.out.println(hour+":"+mint+":"+sec+ "  " + day + date  );
}
}