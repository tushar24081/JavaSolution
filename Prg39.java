/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapracticalsppp;

/**
 *
 * @author TUSHAR
 */
public class Prg39 {
    public static void main(String[] args){
        int n1, n2, n3;
        n1 = Integer.parseInt(args[0]);
        n2 = Integer.parseInt(args[1]);
        n3 = Integer.parseInt(args[2]);
        
        int[] arr = {n1, n2, n3};
        int max, min, pos=0 , neg=0, sum=0;
        max = arr[0];
        min = arr[0];
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(arr[i] > max){
                max = arr[i];
            }
            
            if(arr[i] < min){
                min = arr[i];
            }
            
            if(arr[i] < 0){
                neg++;
            }
            else{
                pos++;
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Negative: " + neg);
        System.out.println("Positive: " + pos);
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + sum / arr.length);
        
    }
}
