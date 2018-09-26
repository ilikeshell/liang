/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundedtypedemo;
/**
 *
 * @author kaiyan
 */
public abstract class SimpleGeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    
    /** construct a default geometric object */
    public SimpleGeometricObject(){
        dateCreated = new java.util.Date();
    }
    
    /** construct a object with the specified color and filled value  */
    public SimpleGeometricObject(String colorString, boolean filled){
        dateCreated = new java.util.Date();
        this.color = colorString;
        this.filled = filled;
    }
    
    /** set a new color
     * @param color */
    public void setColor(String color){
        this.color = color;
    }
    
    /** return color
     * @return  */
    public String getColor(){
        return color;
    }
    
    /** return filled
     * @return  */
    public boolean isFilled(){
        return filled;
    }
    
    /** return a new filled
     * @param filled */
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    /** get dateCreated
     * @return  */
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    
    /**
     *
     * @return
     */
    public abstract double getArea();
    
    /** return a string representation of this object
     * @return  */
    @Override
    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color + 
                " and filled: " + filled;
    }
}
