/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03033_boisochungcuasonguyenlon;
import java.util.*;
import java.math.*;

public class J03033_Boisochungcuasonguyenlon {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0){
            BigInteger a = input.nextBigInteger();
            BigInteger b = input.nextBigInteger();
            BigInteger nhan = a.multiply(b);
            BigInteger kq = nhan.divide(a.gcd(b));
            System.out.println(kq);
        }
    }
}