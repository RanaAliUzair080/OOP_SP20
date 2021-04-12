
package lab2;
import java.util.*;

public class Lab2_Activity2_runner {
     public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        Date date1,date2;
        date1 = new Date();
        System.out.println("Enter month : ");
        date1.month = in.nextLine();
        System.out.println("Enter day : ");
        date1.day = in.nextInt();
        System.out.println("Enter Year : ");
        date1.year = in.nextInt();
        
        
        date2 = new Date();
        
        System.out.println("Enter day : ");
        date2.day = in.nextInt();
        System.out.println("Enter Year : ");
        date2.year = in.nextInt();
        System.out.println("Enter month : ");
        date2.month = in.nextLine();
        date2.display();
        date1.display();
}
}