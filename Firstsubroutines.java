/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package firstsubroutines;

import java.util.Scanner;
/**
 *
 * @author albertto
 */
public class Firstsubroutines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word of a phrase, so that we can verify "
                + "if it's a polindrome:");
        String word = scan.nextLine();
        scan.close();
        
        word = removeNonChars(word);
        
        String reverse_word = reverse(word);
        
        System.out.println("The compact word is: " + word);
        System.out.println("The reverse form is: " + reverse_word);
        System.out.println("Therefore...");
        
        if(word.equals(reverse_word)){
            System.out.println("It is a palindrome.");
        }else{
            System.out.println("It isn't a palindrome.");
        }
        
        
    }
    
    /**
     * This subroutine gets a String and remove all non-chars from this string.
     * For example: it removes spaces, underscores, dots, or others.
     * @param word
     * @return word without non-chars
     */
    private static String removeNonChars(String word){
        return word.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
    }
    
     /**
     * This subroutine gets a String and returns it backwards.
     * @param word
     * @return word backwards
     */
    private static String reverse(String word){
        String result ="";
        
        for(int i = word.length() -1; i >= 0; i--){
            result += word.charAt(i);
        }
        
        return result;
    }
}
