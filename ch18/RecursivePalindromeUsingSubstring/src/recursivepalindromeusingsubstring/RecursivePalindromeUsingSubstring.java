/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivepalindromeusingsubstring;

/**
 *
 * @author kaiyan
 */
public class RecursivePalindromeUsingSubstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Is moon a palindrome? " + isPalindrome("moon"));
        System.out.println("Is noon a palindrome? " + isPalindrome("noon"));
        System.out.println("Is a a palindrome? " + isPalindrome("a"));
        System.out.println("Is aba a palindrome? " + isPalindrome("aba"));
        System.out.println("Is ab a palindrome? " + isPalindrome("ab"));
        System.out.println("Is 上海自来水来自海上 a palindrome? " + isPalindrome("上海自来水来自海上"));
    }
    
    public static boolean isPalindrome(String s){
        if(s.length() == 0 || s.length() == 1)
            return true;
        
        if(s.charAt(0) == s.charAt(s.length() - 1))
            return isPalindrome(s.substring(1, s.length() - 1));
        else
            return false;
    }
}
