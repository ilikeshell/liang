/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex18_8;

/**
 *
 * @author kaiyan
 */
public class Ex18_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        reverseDisplay(12345);
        reverseDisplay("abcdefghijklmn");
        System.out.println(count("welcome to home", 'e'));
        System.out.println(sumDigits(12345));
    }
    
    public static void reverseDisplay(int value){
        if(value > 0)
        {
            System.out.print(value % 10);
            reverseDisplay(value / 10);
        }
        else
            System.out.println("");
    }
    
    public static void reverseDisplay(String value){
        if(value.length() >= 1 ){
            System.out.print(value.charAt(value.length() - 1));
            reverseDisplay(value.substring(0, value.length() - 1));
        }
        else
            System.out.println("");
    }
    
    public static int count(String string, char a){
        int count = 0;
        if (string.length() >= 1) {
            if(string.charAt(string.length() - 1) == a)
                count++;
            count+=count(string.substring(0, string.length() - 1), a);
        }
        return count;
    }
    
    public static int sumDigits(long n){
        int sum = 0;
        if(n > 0){
            sum += n % 10;
            sum += sumDigits(n/10);
        }
        return sum;
    }
    
}
