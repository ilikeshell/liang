/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kaiyan
 */
public class TestCircleRectangle {
    public static void main(String[] args) {
        SimpleCircle circle = new SimpleCircle(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());
        
        SimpleRectangle rectangle = new SimpleRectangle(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
        
        displayObject(new SimpleCircle(1, "red", false));
        displayObject(new SimpleRectangle(1, 1, "black", true));
    }
    
    /** Display geometric object properties */
    public static void displayObject(SimpleGeometricObject object){
        System.out.println("Created on " + object.getDateCreated() + ". Color is "
            +object.getColor());
    } 
}
