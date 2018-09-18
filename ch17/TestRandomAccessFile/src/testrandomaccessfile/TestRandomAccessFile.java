/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testrandomaccessfile;
import java.io.*;
/**
 *
 * @author kaiyan
 */
public class TestRandomAccessFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        try(
            RandomAccessFile raf = new RandomAccessFile("inout.dat", "rw");
            ){
            
            raf.setLength(0);
            for (int i = 0; i < 200; i++) {
                raf.writeInt(i);
            }
            
            System.out.println("Current file length is " + raf.length());
            
            raf.seek(0);
            System.out.println("The first number is " + raf.readInt());
            
            raf.seek(1 * 4);
            System.out.println("The second number is " + raf.readInt());
            
            raf.seek(9 * 4);
            System.out.println("The tenth number is " + raf.readInt());
            
            raf.writeInt(555);
            raf.seek(raf.length());
            raf.writeInt(999);
            
            System.out.println("the new length is " + raf.length());
            
            raf.seek(10 * 4);
            System.out.println("The eleventh number is " + raf.readInt());
        }
    }
    
}
