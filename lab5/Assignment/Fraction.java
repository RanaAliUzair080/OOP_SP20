
package lab5;

/**
 *
 * @author Rana Alie
 */
public class Fraction {
    private int num1;
    private int num2;
    
    
    public Fraction(){
        num1 = 1 ;
        num2 = 1 ;
    }
    public Fraction(int a , int b ){
        num1 = a ; num2 = b ;
    }
    public void setNumber1(int a){
        num1 = a ;
    }
    public void setNumber2(int a){
        num2 = a ;
    }
    public double get(){
        return (num1/num2);
    }
    public void display(){
        double fraction = (double)num1/(double)num2 ;
        System.out.println("Fraction of both Number is : " + fraction);
    }
    public void equals(double a){
        double fraction = num1/num2 ;
        if(fraction == a){
            System.out.println("Fraction is Same...");
        }
        else
            System.out.println("Fraction is not Same...");
    }    
}

