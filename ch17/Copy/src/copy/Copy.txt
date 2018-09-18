/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author kaiyan
 */
public class Copy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("Usage: java copy sourcefile targetfile");
            System.exit(1);
        }
        
        File souceFile = new File(args[0]);
        if (!souceFile.exists()) {
            System.out.println("source file " + args[0] + " not exists");
            System.exit(2);
        }
        
        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("target file " + args[1] + " already exists");
            System.out.println("3");
        }
        
        try {
            try(BufferedInputStream input = new BufferedInputStream(new FileInputStream(souceFile));
                    BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));){
                int r;
                int numberOfRead = 0;
                while((r = input.read()) != -1){
                    
                    output.write(r);
                    numberOfRead++;
                }
           // L:    System.out.println(numberOfRead +" bytes copied");
            }
        } 
        catch (EOFException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            //goto L;
            System.out.println("All data were read!");
        }
        
    }
    
}
