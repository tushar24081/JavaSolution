/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapracticalsppp;

import java.util.Scanner;

/**
 *
 * @author TUSHAR
 */
public class Prg34 {
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
        
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiply");
        System.out.println("4. Exit");
        int ch;
        System.out.println("Enter the choice: ");
        ch = sc.nextInt();
        
        MaxOp m = new MaxOp(r, c, first, second);
        switch(ch){
            case 1:
                int[][] res = new int[r][c];
                res = m.mat_add();
                for(int i=0; i<r; i++){
                    for(int j=0; j<c; j++){
                        System.out.print(res[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                int[][] resSub = new int[r][c];
                resSub = m.mat_sub();
                for(int i=0; i<r; i++){
                    for(int j=0; j<c; j++){
                        System.out.print(resSub[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                int[][] resMul = new int[r][c];
                resMul = m.mat_mul();
                for(int i=0; i<r; i++){
                    for(int j=0; j<c; j++){
                        System.out.print(resMul[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Not Valid");
                break;        
        }
    }
}

class MaxOp{
    int r,c;
    int[][] first = new int[r][c];
    int[][] second = new int[r][c];
    
    public MaxOp(int r, int c, int[][] first, int[][] second){
        this.r = r;
        this.c = c;
        this.first = first;
        this.second = second;
    }
    
    public int[][] mat_add(){
        int res[][] = new int[r][c];
        for(int i=0; i<first.length; i++){
            for(int j=0; j<first[0].length; j++){
                res[i][j] = first[i][j] + second[i][j];
            }
        }
        return res;
    }
    
    public int[][] mat_sub(){
        int res[][] = new int[r][c];
        for(int i=0; i<first.length; i++){
            for(int j=0; j<first[0].length; j++){
                res[i][j] = first[i][j] - second[i][j];
            }
        }
        return res;
    }
    
    public int[][] mat_mul(){
        int res[][] = new int[r][c];
        for(int i=0; i<first.length; i++){
            for(int j=0; j<second[0].length; j++){
                for(int k=0; k<second.length; k++){
                    res[i][j] += first[i][k] * second[k][j];
                }
                
            }
        }
        return res;
    }
}
