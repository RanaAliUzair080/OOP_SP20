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
public class OrderedHourlyEmployee extends HourlyEmployee implements Ordered{
    public boolean precedes(Object other) {
        if (other == null)
            return false;
        else if (!(other instanceof OrderedHourlyEmployee))
            return false;
        else{
            OrderedHourlyEmployee otherOrderedHourlyEmployee = (OrderedHourlyEmployee)other;
            return (getPay() < otherOrderedHourlyEmployee.getPay());
        }
    }

    public boolean follows(Object other){
        if (other == null)
            return false;
        else if (!(other instanceof OrderedHourlyEmployee))
            return false;
        else{
            OrderedHourlyEmployee otherOrderedHourlyEmployee = (OrderedHourlyEmployee)other;
        return (otherOrderedHourlyEmployee.precedes( this));
        } 
    }
}
