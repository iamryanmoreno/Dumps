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
public class Clamp2 {
    public static void main(String args[]){
        int array[] = {1,1,2,2,2,4,5};
        int n1, n2;
        int count = 0;
        for (int i = 0; i < array.length; i++){
            //System.out.println(array[i]);
            n1 = array[i];
            //int n = i+1;
            n2 = array[i] + 1;
            if (n1 == n2){
                count = count + 1;
            }
        }
        
        System.out.println(count);
    }
}
