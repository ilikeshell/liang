/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detectendoffile;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author kaiyan
 */
public class DetectEndOfFile {
    public static void main(String[] args) {
        try {
            try(DataOutputStream output = 
                    new DataOutputStream(new FileOutputStream("temp.dat"));){
                output.writeDouble(4.5);
                output.writeDouble(43.25);
                output.writeDouble(3.2);
            }
            
            try(DataInputStream input = 
                    new DataInputStream(new FileInputStream("temp.dat"));){
                while (true) {                    
                    System.out.println(input.readDouble());
                }
            }
        } catch (EOFException e) {
            System.out.println("All data were read");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
