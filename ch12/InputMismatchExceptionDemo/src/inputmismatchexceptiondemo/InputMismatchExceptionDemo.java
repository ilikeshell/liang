/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputmismatchexceptiondemo;

/**
 *
 * @author kaiyan
 */
import java.util.*;
public class InputMismatchExceptionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        
        do {   
            try {
                System.out.println("Enter an integr: ");
                int number = input.nextInt();
                
                //Dispaly the result
                System.out.println("The number entered is " + number);
                
                continueInput = false;
            } catch (InputMismatchException e) {
                System.out.println("Try again, an integer is required");
                input.nextLine();
            }
            
        } while (continueInput);
    }
    
}
