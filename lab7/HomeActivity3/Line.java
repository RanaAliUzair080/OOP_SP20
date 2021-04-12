/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author Rana Alie
 */
public class Line {
    Point startPoint ;
    Point endPoint ;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }
    public void getLenght(){
        System.out.println(Math.sqrt(Math.pow(endPoint.getX_cord()-startPoint.getX_cord(), 2)- Math.pow(endPoint.getY_cord()-startPoint.getY_cord(), 2)));
    }
}
