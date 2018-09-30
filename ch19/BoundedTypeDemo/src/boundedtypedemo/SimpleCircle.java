package boundedtypedemo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kaiyan
 */
public class SimpleCircle extends SimpleGeometricObject{
    private double radius;
    
    public SimpleCircle(){
    }
    
    public SimpleCircle(double radius){
        this.radius = radius;
    }
    
    public SimpleCircle(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    
    /** return radius */
    public double getRadius(){
        return radius;
    }
    
    /** set a new radius */
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    /** return area */
    public double getArea(){
        return radius * radius * Math.PI;
    }
    
    /** return diameter */
    public double getDiameter(){
        return radius * 2;
    }
    
    /** return perimeter */
    public double getPerimeter(){
        return radius * 2 * Math.PI;
    }
    
    /** Print the circle info */
    public void printCircle(){
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }
}
