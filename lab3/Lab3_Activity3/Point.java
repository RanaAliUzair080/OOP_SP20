

package lab3;


public class Point {
    private int x ;
    private int y ;
    
    public Point(){
        x=1;
        y=1;
    }
    public Point(int a , int b){
        x=a;
        y=b;
    }
    public void setX(int a){
        x=a;
    }
    public void SetY(int a){
        y=a;
    }
    public void move(int a, int b){
        x=x+a;
        y=y+b;
        System.out.println("x coordinate after moving = "+x+" y coordinate after moving ="+y);
    }
    public void display(){
        System.out.println("x coordinate = "+x+" y coordinate = "+y);
    }
}
