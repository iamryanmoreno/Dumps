/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NOCExam;

/**
 *
 * @author Ryan
 */
import java.util.Scanner;
public class Palindrome {
    static String Palindrome(String str){
        String reverse = "";
        int length = str.length();
        for (int i = length-1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        
        if (reverse.equals(str)){
            return "Palindrome";
        } else{
            return "Not Palindrome";
        }
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String pal = input.nextLine();
        System.out.print(Palindrome.Palindrome(pal));
        
    }
}
