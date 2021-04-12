
package lab2;
import java.util.*;

public class Lab1_Activity1_Runner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        CorseResult c1,c2;
        c1 = new CorseResult();
        System.out.print("Enter Name : ");
        c1.Studentname = in.nextLine();
        System.out.print("Course Name : ");
        c1.Coursename = in.nextLine();
        System.out.print("Grade : ");
        c1.grade = in.nextLine();
        
        c2 = new CorseResult();
        System.out.print("Enter Name : ");
        c2.Studentname = in.nextLine();
        System.out.print("Course Name : ");
        c2.Coursename = in.nextLine();
        System.out.print("Grade : ");
        c2.grade = in.nextLine();
        c2.disply();
        c1.disply();
}
}