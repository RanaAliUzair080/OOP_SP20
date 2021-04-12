
package lab3;

public class Time {
    public int hour;
    public int mins;
    public int sec;
    
    
    public Time(){
        hour = 0;
        mins = 0;
        sec = 0;
    }
    public Time (int a , int b ,int c){
        hour = a;
        mins = b;
        sec = c;
    }
    public int check(){
        if((hour>=0 && hour<=24) && (mins>=0 && mins<=60)&& (sec>=0 && sec<=60)){
            System.out.println("Valid.....");
            return 1;
        }
        else{
            System.out.println("Not valid....");
            return 2;
        }
    }
    public void display(){
        int chk = check();
        if (chk == 1){
                System.out.println("" + hour +":"+mins+":"+sec);
        }
    }
}
