
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kaiyan
 */
public class ObservablePropertyDemo {
    public static void main(String[] args) {
        DoubleProperty balance = new SimpleDoubleProperty();
        balance.addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable ov) {
                System.out.println("The new Value is " + 
                        balance.doubleValue()); 
            }
        });
        
        balance.setValue(4.5);
        balance.setValue(8.8);
    }
}
