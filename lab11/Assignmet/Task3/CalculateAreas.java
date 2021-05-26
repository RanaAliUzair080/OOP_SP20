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
public class CalculateAreas {
    private Shape[] shape;
    private double[] area;
    
    public CalculateAreas(Shape[] o) {
        shape = new Shape[o.length];
        for(int i = 0; i<o.length; i++){
            shape[i] = o[i];
            
        }
        area = new double[50];
    }
    
    public void calArea(){
        double Area;
        for(int i = 0 ; i<shape.length ; i++){
            if(shape[i] != null){
                Area = shape[i].area();
                area[i] = Area;
            }   
        }
    }
    
    @Override
    public String toString() {
        double TotalArea = 0;
        for (int i = 0; i<shape.length;i++){
            if(area[i] != 0){
                TotalArea = TotalArea + area[i];
            }
            
        }
        return "Total Area of All Shapes: " + TotalArea;
    }
}
