/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.*;
/**
 *
 * @author Rana Alie
 */
public class Lab2_assignment2_runner {
    public static void main(String[] args){
      Scanner in = new Scanner (System.in);
      Rectangle r1,r2;
      r1 = new Rectangle();
      System.out .println("Enter height : ");
      r1.height = in.nextInt();
      System.out.println("Enter width : ");
      r1.width = in.nextInt();
      
      //in.nextLine();
      
      System.out.println("Enter colour : ");
      r1.colour = in.next();
      r1.display();
      //r1.Area(r1.height , r1.width);
    }
}
