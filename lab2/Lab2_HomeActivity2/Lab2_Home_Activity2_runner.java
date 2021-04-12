
package lab2;


public class Lab2_Home_Activity2_runner {
    public static void main(String[] args) {
        Time t1,t2;
        t1 = new Time();
        t1.date = 22;
        t1.day = "sunday  ";
        t1.hour = 11;
        t1.mint = 11;
        t1.sec = 11;
        t1.display();
        
        t2 = new Time();
        t2.date = 11;
        t2.day = "  friday  ";
        t2.hour = 12;
        t2.mint = 12;
        t2.sec = 12;
        t2.display();
}
}