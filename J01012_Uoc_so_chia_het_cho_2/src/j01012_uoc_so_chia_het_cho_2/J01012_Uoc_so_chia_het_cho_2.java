/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01012_uoc_so_chia_het_cho_2;

import java.util.*;
import java.math.*;
        
public class J01012_Uoc_so_chia_het_cho_2 {
    static int tong_Uocso(int n){
        int cnt=0;
        if(n%2==0){
            cnt=1;
        }
        for(int i=2;i*i<=n;i+=1){
            if(n%i==0){
                if(i%2==0){
                    cnt+=1;
                }
                if((n/i)%2==0 && i*i!=n){
                    cnt+=1;
                }
            }
        }
        return cnt;
    }
/*    static int tong_Uocso(int n){
        int cnt=0;
        if(n%2==0){
            cnt=1;
        }
        int i=0;
        for(i=2;i*i<n;i+=2){
            if(n%i==0){
                if((n/i)%2==0){
                    cnt+=2;
                }
                else{
                    cnt+=1;
                }
            }
        }
        if(i*i==n){
            cnt+=1;
        }
        return cnt;
    }
*/
    public static void main(String[] args) {
        int t;
        Scanner input = new Scanner(System.in);
        t=input.nextInt();
        while (t-->0){
            int a;
            a=input.nextInt();
            System.out.println(tong_Uocso(a));
        }
    }
    
}
