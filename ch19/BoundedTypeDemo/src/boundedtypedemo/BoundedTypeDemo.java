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
public class BoundedTypeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleRectangle rectangle = new SimpleRectangle(4, Math.PI);
        SimpleCircle circle = new SimpleCircle(2);
        
        System.out.println("Same area: " + equalArea(rectangle, circle));
    }
    
    public static <E extends SimpleGeometricObject> boolean equalArea(E obj1, E obj2){
        return obj1.getArea() == obj2.getArea();
    }
}
