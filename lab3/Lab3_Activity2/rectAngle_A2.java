
package lab3;


public class rectAngle_A2 {
    public int height;
    public int widht;
    
    public rectAngle_A2(){
        height= 5 ; widht = 2;
    }
    public rectAngle_A2(int w , int h ){
        height = h;widht = w;
    }
     public int Calculatearea(){
        return (height*widht);
     }
}
