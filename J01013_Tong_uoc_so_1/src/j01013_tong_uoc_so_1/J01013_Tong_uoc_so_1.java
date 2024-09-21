/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01013_tong_uoc_so_1;
import java.util.*;
import java.math.*;

public class J01013_Tong_uoc_so_1 {
   
    static Scanner input = new Scanner(System.in);
    static long uoc_so(int n){
        long tong=0;
        int i=2;
        while (n>=i){
            int dem=0;
            while (n%i==0){
                n=n/i;
                dem+=1;
            }
            if(dem!=0){
                tong+=dem*i;
            }
            i+=1;
        }
        return tong;
    }
    public static void main(String[] args) {
        int t = input.nextInt();
        long ans=0;
        while (t-->0){
            int a=input.nextInt();
            ans+=uoc_so(a);
        }
        System.out.println(ans);
        
    }
    
}
