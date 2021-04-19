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
public class Lab8_HomeActivity_Runner {
    public static void main(String[] args){
        Parson p = new Parson("rana Ali uzair","lahore","1245786325841","email");
        System.out.println("Showing simple data person :");
        p.display();
        System.out.println();
        
        student_HAL8 s = new student_HAL8("Pass","Shehroz","isl","12546325","email");
        System.out.println("Showing Student data Status :");
        s.display();
        System.out.println();
        
        Employee_HAL8 e = new Employee_HAL8("Main office","15000","Tahir","isl","01254632145","email"); 
        System.out.println("Showing Employee Data :");
        e.display();
        System.out.println();
        
        Faculty_HAL8 f = new Faculty_HAL8(8,18,"Main office","15000","Tahir","isl","01254632145","email");
        System.out.println("Showing Feculty data :");
        f.display();
        System.out.println();
        
        Staff_HAL8 st = new Staff_HAL8();
        System.out.println("Showing Staff data :");
        st.display();
        System.out.println();
    }
}
