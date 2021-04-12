
package lab3;
import java.util.*;

public class Lab3_Activity1_Runner {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ractAngle rect;
        rect = new ractAngle();
        System.out.println("Enter hight : ");
        rect.hight = in.nextInt();
        System.out.println("Enter widht : ");
        rect.widht = in.nextInt();
        System.out.println(rect.Calculatearea());
        
    }
}
