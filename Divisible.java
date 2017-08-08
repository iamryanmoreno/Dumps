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
public class Divisible {
    static String Divisibleby47(int a){
        if (a%4==0 && a%7==0){
            return "by4and7";
        } else if (a%4==0){
            return "by4";
        } else if (a%7==0){
            return "by7";
        } else{
            return "No";
        }
    }
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an interger: ");
        int num = input.nextInt();
        System.out.println(Divisible.Divisibleby47(num));
    }
}
