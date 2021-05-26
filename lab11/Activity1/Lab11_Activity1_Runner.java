/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author Rana Alie
 */
public class Lab11_Activity1_Runner {
    public static void main(String args[]){
        EmplayeeTask emp = new EmplayeeTask("Devil","12 june",48751245);
        emp.register();
        System.out.println();
        StudentTask stu = new StudentTask("Devil",22,3.56);
        stu.register();
    }
}
