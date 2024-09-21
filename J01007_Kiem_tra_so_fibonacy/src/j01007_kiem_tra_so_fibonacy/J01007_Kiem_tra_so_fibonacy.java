/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01007_kiem_tra_so_fibonacy;

import java.util.*;
import java.math.*;

/**
 *
 * @author Hello
 */
public class J01007_Kiem_tra_so_fibonacy {

    /**
     * @param args the command line arguments
     */
    public static Scanner input = new Scanner(System.in);
    public static long[] fibo = new long[100];
    public static void chuanbi(){
        fibo[1]=1;
        fibo[2]=1;
        for(int i = 3;i<=99;i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
    }
    public static boolean isFibo(long n){
        for(long i : fibo){
            if(i==n){
                return true;
            }
            else if (i>n){
                return false;
            }
        }
        return false;
    }
    public static void testCase(){
        long n = input.nextLong();
        if(isFibo(n)==false){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
    
    public static void main(String[] args) {
        int t = input.nextInt();
        while (t-->0){
            chuanbi();
            testCase();
        }
    }
    
}
