/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kaiyan
 */
public class TestCircleWithException {
    public static void main(String[] args) {
        try {
            CircleWithException c1 = new CircleWithException(5);
            CircleWithException c2 = new CircleWithException(-5);
            CircleWithException c3 = new CircleWithException(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        
        System.out.println("Number of objects created: " + 
                CircleWithException.getNumberOfObjects());
    }
    
}
