/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapracticalsppp;

/**
 *
 * @author TUSHAR
 */
public class Prg40 {
    public static void main(String[] args){
        int n1, n2, n3, n4, n5, temp;
        n1 = Integer.parseInt(args[0]);
        n2 = Integer.parseInt(args[1]);
        n3 = Integer.parseInt(args[2]);
        n4 = Integer.parseInt(args[3]);
        n5 = Integer.parseInt(args[4]);
        
        int[] arr = {n1, n2, n3, n4, n5};
        
        for(int i=0; i<arr.length-1; i++){
           for(int j = 0; j<arr.length-1; j++){
               if(arr[j] > arr[j+1]){
                   temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
        System.out.println("Sorted array");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
        
        
    }
}
