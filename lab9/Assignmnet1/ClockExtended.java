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
public class ClockExtended extends Clock{
    private String time ;

    public ClockExtended(String time, int hr, int min, int sec) {
        super(hr, min, sec);
        this.time = time;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.print(time+" in 12 hour clock.");
       
        System.out.println();
        System.out.println(hours24());
        System.out.println(time+" in 24 hour clock.");
    }
    
   public String hours24(){
        int hours = super.getHr();
        if("pm".equals(time.toLowerCase())){
            
            return hours+12 + ":" + super.getMin() + ":" + super.getSec();
        
        }
        else
            return hours + ":" + super.getMin() + ":" + super.getSec();
    }
    
}
