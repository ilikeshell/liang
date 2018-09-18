/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivepalindrome;

/**
 *
 * @author kaiyan
 */
public class RecursivePalindrome {

    public static boolean isPalindrome(String s){
        return isPalindrom(s, 0, s.length() - 1);
    }
    
    public static boolean isPalindrom(String s, int low, int hi){
        if(low >= hi)
            return true;
        
        if(s.charAt(low) == s.charAt(hi))
            return isPalindrom(s, low + 1, hi - 1);
        else 
            return false;
    }
    
    public static void main(String[] args) {
        System.out.println("Is moon a palindrome? " + isPalindrome("moon"));
        System.out.println("Is noon a palindrome? " + isPalindrome("noon"));
        System.out.println("Is a a palindrome? " + isPalindrome("a"));
        System.out.println("Is aba a palindrome? " + isPalindrome("aba"));
        System.out.println("Is ab a palindrome? " + isPalindrome("ab"));
        System.out.println("Is 上海自来水来自海上 a palindrome? " + isPalindrome("上海自来水来自海上"));
    }
    
}
