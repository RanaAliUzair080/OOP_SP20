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
public class Faculty_HAL8 extends Employee_HAL8{
    private int office_houre ;
    private int rank ;

    public Faculty_HAL8(int office_houre, int rank, String Office, String Salary, String name, String address, String phonr, String email) {
        super(Office, Salary, name, address, phonr, email);
        this.office_houre = office_houre;
        this.rank = rank;
    }

    public Faculty_HAL8() {
        super();
        this.office_houre = 0;
        this.rank = 11;
    }

    public int getOffice_houre() {
        return office_houre;
    }

    public void setOffice_houre(int office_houre) {
        this.office_houre = office_houre;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    
    public void display(){
        super.display();
        System.out.println("Office Houres :" + office_houre);
        System.out.println("RAnk :"+rank);
    }
    
}
