 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromeignorenonalphanumeric;

/**
 *
 * @author kaiyan
 */
import java.util.Scanner;
public class PalindromeIgnoreNonAlphanumeric {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //prompt user input a string
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        
        //Dispaly result
        System.out.println("Ignoring nunalphanummeric characters, \nis "
            + s + "a palindrome? " + isPalindrome(s));
    }
    
    public static boolean isPalindrome(String s){
        //filter
        String sb = filter(s);
        System.out.println(sb);
        
        //reverse
        String rsb = new StringBuilder(sb).reverse().toString();
        System.out.println(rsb);
        
        //is equal?
        
        return sb.equals(rsb);
    }
    
    public static String filter(String s){
        StringBuilder newSb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if (Character.isLetterOrDigit(s.charAt(i))) {
                newSb.append(s.charAt(i));
            }
        }
        return newSb.toString();
    }
    
}
