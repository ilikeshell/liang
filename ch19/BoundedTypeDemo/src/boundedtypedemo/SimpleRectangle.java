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
public class SimpleRectangle extends SimpleGeometricObject{
    private double width;
    private double height;
    
    public SimpleRectangle(){
    }
    
    public SimpleRectangle(double width, double height){
        this.height = height;
        this.width = width;
    }
    
    public SimpleRectangle(
            double width, double height, String color, boolean filled){
        this.height = height;
        this.width = width;
        setColor(color);
        setFilled(filled);
    }
    
    /** return width */
    public double getWidth(){
        return width;
    }
    
     /** set width */
    public void setWidth(double width){
        this.width = width;
    }
    
    /** return height */
    public double getHeight(){
        return height;
    }
    
    /** set height */
    public void setHeight(double height){
        this.height = height;
    }
    
    /** return area */
    public double getArea(){
        return width * height;
    }
    
    /** return perimeter */
    public double getPerimeter(){
        return 2 * (width + height);
    }
}
