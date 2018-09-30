/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex18_8;

import java.util.ArrayList;

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
        String s = "abcdefGhijklMn";
        String str = "welcome to home";
        
        int[] array = {1, 2, 3, 4, 25, 6, 97, 18};
        char[] chars = {'H','e','l','l', ',', 'W', 'O', 'R', 'L', 'D'};
        reverseDisplay(12345);
        reverseDisplay(s);
        reverseDisplay(s, s.length() - 1);
        System.out.println(count(str, 'e'));
        System.out.println(sumDigits(12345));
        System.out.println(max(array, 0));
        System.out.println(countUpperCase(s, 0));
        System.out.println(count(str, 'e', str.length() - 1));
        System.out.println(count(chars, chars.length - 1));
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
    
    public static void reverseDisplay(String value, int high){
        if(high >= 0){
            System.out.print(value.charAt(high));
            reverseDisplay(value, high - 1);
        }
        else
            System.out.println("");
    }
    
    public static int max(int[] array, int index){
        int maxValue = 0;
        int temp;
        
        if(index < array.length)
        {
            maxValue = array[index];
            temp = max(array, index + 1);
            if(temp > maxValue)
                maxValue = temp;
        }
            
        return maxValue;
    }
    
    public static int countUpperCase(String s, int index){
        int count = 0;
        char c;
        
        if(index < s.length()){
            c = s.charAt(index);
            if(c >= 'A' && c <= 'Z')
                count++;
            count += countUpperCase(s, index + 1);
        }
        return count;
    }
    
    public static int count(String str, char a, int high){
        int count = 0;
        if(high >= 0){
            if(str.charAt(high) == a)
                count++;
            count += count(str, a, high - 1);
        }
        
        return count;
    }
    
    //count the number of uppercase chars
    public static int count(char [] chars, int high){
        int n = 0;
        if(high >= 0){
            if(chars[high] >= 'A' && chars[high] <= 'Z')
                n++;
            n += count(chars, high - 1);
        }
        
        return n;
    }
    
    
    public static int count(char [] chars, char ch, int high){
        int n = 0;
        if(high >= 0){
            if(chars[high] == ch)
                n++;
            n += count(chars, ch, high - 1);
        }
        
        return n;
    }
}
