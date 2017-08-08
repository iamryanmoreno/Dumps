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
public class Clamp {
    
    static int Clamp(int arr[]){
        
        int n1, n2;
        int count = 0;
        for (int i = 1; i <= arr.length; i++){
            n1 = arr[i];
            n2 = arr[i+1];
            if (n1 == n2){
                count = count + 1;
            }
        }
        return count;
        
    }
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);
        Scanner arr = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = num.nextInt();
        System.out.print("Enter the array: ");
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++){
            a[i] = arr.nextInt();
            System.out.println(Clamp.Clamp(a));
        }
    }
}
