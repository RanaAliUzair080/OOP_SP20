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
public class Tape extends Publication{
    private String playTime ;

    public Tape(String playTime, String title, String price) {
        super(title, price);
        this.playTime = playTime;
    }

    public Tape() {
        super();
        this.playTime = "00";
    }

    public String getPlayTime() {
        return playTime;
    }

    public void setPlayTime(String playTime) {
        this.playTime = playTime;
    }
    
    public void display(){
        super.display();
        System.out.println("Total playTime :" + playTime);
    }
    
}
