/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapracticalsppp;
import java.util.*;
/**
 *
 * @author TUSHAR
 */
public class Prg33 {
    public static void main(String[] args){
        int n, ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of elements you want: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n ;i ++){
            System.out.println("Enter the elemet  " + i);
            arr[i] = sc.nextInt();
        }
        
        System.out.println("1. Sort Elements");
        System.out.println("2. Search Elements");
        System.out.println("Enter the choice: ");
        ch = sc.nextInt();
        ArrayOp a = new ArrayOp(arr);
        switch(ch){
            case 1:
                int rArray[] = new int[n];
                rArray = a.sorting();
                for(int i=0; i<n; i++){
                    System.out.print(rArray[i] + " ");
                }
                break;
            case 2:
                System.out.println("Element found at location: " + a.searching());
                break;
            default:
                System.out.println("Not Valid");
                break;        
        }
    }
}

class ArrayOp{
   int[] arr;
   int temp;
   Scanner sc = new Scanner(System.in);
   public ArrayOp(int[] arr){
       this.arr = arr;
   }
   
   public int[] sorting(){
       for(int i=0; i<arr.length-1; i++){
           for(int j = 0; j<arr.length-1; j++){
               if(arr[j] > arr[j+1]){
                   temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
       return arr;
   }
   
   public int searching(){
       int num, ans = -1;
       System.out.println("Enter number you want to search in Array");
       num = sc.nextInt();
       for(int i=0; i<arr.length; i++){
           if(arr[i] == num){
               ans =i;
           }
       }
       return ans;
   }
}



