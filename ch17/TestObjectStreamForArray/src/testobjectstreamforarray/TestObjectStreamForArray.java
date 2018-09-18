/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testobjectstreamforarray;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author kaiyan
 */
public class TestObjectStreamForArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
            throws ClassNotFoundException, IOException{
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Pappa", "mama", "yaya"};
        
        try(
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("temp.dat", true));
            ){
            out.writeObject(numbers);
            out.writeObject(names);
        }
        
        
        try(
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("temp.dat"));
            ){
            int[] testint = (int[]) in.readObject();
            String[] teStrings = (String[]) in.readObject();
            for(int i : testint)
                System.out.print(i + " ");
            System.out.println();
            
            for(String s : teStrings)
                System.out.print(s +" ");
            System.out.println();
        }
    }
    
}
