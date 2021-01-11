/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validpalindrome;

import java.util.Scanner;

/**
 *
 * @author zukhruf
 */
public class ValidPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         boolean result;
        String pattern = "[^a-zA-Z0-9]*";
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s2 = "";
        s = s.replaceAll(pattern, "");
        int length = s.length();
        
        for(int i = length - 1; i >= 0; i--){
            s2 = s2 + s.charAt(i);
        }
        if (s.equalsIgnoreCase(s2)){
            System.out.println("String 1: "+s);
            System.out.println("String 2: "+s2);
            result = true;
        }else{
            result = false;
        }
        System.out.println("Is Palindrome : "+result); 
    }
    
}
