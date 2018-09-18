
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kaiyan
 */
public class TestObjectOutputStream {
    public static void main(String[] args) throws IOException{
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("temp.dat"));){
            out.writeUTF("john");
            out.writeDouble(85.5);
            out.writeObject(new java.util.Date());
        }
    }
    
}
