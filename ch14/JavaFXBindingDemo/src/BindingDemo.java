/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kaiyan
 */
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class BindingDemo {
    public static void main(String[] args) {
        DoubleProperty d1 = new SimpleDoubleProperty(1);
        DoubleProperty d2 = new SimpleDoubleProperty(2);
        d1.bind(d2.multiply(2));
        System.out.println("d1 is " + d1.getValue()
         + " and d2 is " + d2.getValue());
        d2.setValue(99.1123);
        System.out.println("d1 is " + d1.getValue()
         + " and d2 is " + d2.getValue());
    }
}
