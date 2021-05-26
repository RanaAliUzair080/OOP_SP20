/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
/**
 *
 * @author Rana Alie
 */
public class TestApplication implements EnhancedShape{
     private double length,width;

    public TestApplication(double length, double width){
        this.length = length;
        this.width = width;
    }

    
    public double parameter() {
        return 2*(length+width);
    }

    
    public Rectangle getBounds() {
        return null;
    }

    
    public Rectangle2D getBounds2D() {
        return null;
    }

    
    public boolean contains(double x, double y) {
        return false;
    }

    
    public boolean contains(Point2D p) {
        return false;
    }

    public boolean intersects(double x, double y, double w, double h) {
        return false;
    }

    public boolean intersects(Rectangle2D r) {
        return false;
    }

    public boolean contains(double x, double y, double w, double h) {
        return false;
    }

    public boolean contains(Rectangle2D r) {
        return false;
    }

    public PathIterator getPathIterator(AffineTransform at) {
        return null;
    }

    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return null;
    }
}
