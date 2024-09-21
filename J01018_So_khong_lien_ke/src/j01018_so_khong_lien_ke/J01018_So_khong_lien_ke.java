/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01018_so_khong_lien_ke;
import java.util.*;
import java.math.*;

public class J01018_So_khong_lien_ke {
    static Scanner input = new Scanner(System.in);
    
    static boolean testCase(){
        char[] n=input.nextLine().toCharArray();
        int sum=0;
        for (char i : n){
            sum+=i-'0';
        }
        if(sum%10!=0){
            return false;
        }
        for (int i=1;i<n.length ; i++){
            if(Math.abs(n[i]-n[i-1])!=2){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int t=input.nextInt();
        input.nextLine();
        while (t-->0){
            if(testCase()==true){
                System.out.print("YES\n");
            }
            else{
                System.out.print("NO\n");
            }
        }
    }
    
}
