/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dirsize;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author kaiyan
 */
public class DirSize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter a directory or a file: ");
        Scanner input = new Scanner(System.in);
        String file = input.nextLine();
        
        System.out.println(getSize(new File(file)) + " bytes");
    }
    
    public static long getSize(File file){
        long size = 0;
        
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                size += getSize(files[i]);
            }
        }
        else
            size += file.length();
        
        return size;
    }
}
