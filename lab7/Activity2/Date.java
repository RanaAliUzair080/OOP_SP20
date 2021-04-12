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
public class Date {
    public int day ;
    public int month ;
    public int year ;
    
    public Date(int d , int m ,int y){
        this.day = checkday(d) ;
        this.month = checkMonth(m) ;
        this.year = y ;
    }
    
    private int checkMonth(int month){
        if(month>0 && month<=12)
            return month;
        else 
            System.out.println("invalid month"+month+"is set to 1");
        return 1;
    }
    private int checkday(int day){
        if(day >0 && day<=31){
            return day ;
        }
        else
            System.out.println("invalid day"+day+ "is set to 1");
        return 1 ;
    }
    public int getDay(){
        return day ;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year ;
    }
    public void setDay(int day){
        this.day = day ;
    }
    public void setYear(int year){
        this.year = year ;
    }
    public void setMonth(int month){
        this.month = month ;
    }
    public void display(){
        System.out.println(day+"/"+month+"/"+year);
    }
}
