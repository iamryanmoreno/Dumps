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

//Create program that will accept two string (string1 and string 2)
//and print each character consecutively
// if not the same length, return string "Empty String"
import java.util.Scanner;
public class ZipString {
    static String zipStr(String string1, String string2){
        String word = "";
        if (string1.length() == string2.length()){
            for (int i = 0; i < string1.length(); i++){
                word = word + string1.charAt(i) + string2.charAt(i);
            }
            return word;
        } else {
            return "Empty String";
        }
    }
    public static void main (String args[]){
        Scanner str1 = new Scanner(System.in);
        Scanner str2 = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = str1.nextLine();
        System.out.print("Enter second string: ");
        String s2 = str2.nextLine();
        System.out.println(ZipString.zipStr(s1, s2));
    }
}
