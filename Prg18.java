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
public class Prg18 {
    public static void main(String[] args){
        int r, c;
        System.out.println("Enter Numbers of rows you want: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        
        System.out.println("Enter Numbers of Columns you want: ");
        c = sc.nextInt();
        int addRes[][] = new int[r][c];
        int addMin[][] = new int[r][c];
        int addMul[][] = new int[r][c];
        System.out.println("Enter values for First matrix");
        int first[][] = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.printf("Enter Element [%d][%d]", i,j);
                first[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter values for Second matrix");
        int second[][] = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.printf("Enter Element [%d][%d]", i,j);
                second[i][j] = sc.nextInt();
            }
        }
        
        
        System.out.println("Addition here!");
      
        for(int i=0; i<first.length; i++){
            for(int j=0; j<first[0].length; j++){
                addRes[i][j] = first[i][j] + second[i][j];
            }
        }
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(addRes[i][j] + " ");
            }
            System.out.println();
        }
        
        
        System.out.println("Sub here!");
      
        for(int i=0; i<first.length; i++){
            for(int j=0; j<first[0].length; j++){
                addMin[i][j] = first[i][j] - second[i][j];
            }
        }
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(addMin[i][j] + " ");
            }
            System.out.println();
        }
        
       System.out.println("Mul here!");
      
        for(int i=0; i<first.length; i++){
            for(int j=0; j<second[0].length; j++){
                for(int k=0; k<second.length; k++){
                    addMul[i][j] += first[i][k] * second[k][j];
                }
                
            }
        }
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(addMul[i][j] + " ");
            }
            System.out.println();
        }

    }
}
