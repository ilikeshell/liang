/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testobjectinputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author kaiyan
 */
public class TestObjectInputStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
            throws ClassNotFoundException, IOException{
        try(ObjectInputStream input = 
                new ObjectInputStream(new FileInputStream("temp.dat"));){
            String name = input.readUTF();
            double score = input.readDouble();
            java.util.Date date = (java.util.Date) input.readObject();
            System.out.println(name + " " + score + " " + date);
        }
    }
    
}
