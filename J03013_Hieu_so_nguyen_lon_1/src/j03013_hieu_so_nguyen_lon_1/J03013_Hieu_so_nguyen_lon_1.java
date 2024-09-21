/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03013_hieu_so_nguyen_lon_1;

/**
 *
 * @author Hello
 */
import java.util.*;
import java.math.*;

public class J03013_Hieu_so_nguyen_lon_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int t= input.nextInt();
        while (t-->0){
            BigInteger a = input.nextBigInteger();
            BigInteger b = input.nextBigInteger();
            
            BigInteger kq = a.subtract(b).abs();
            int sl=Math.max((a.toString().length()),b.toString().length())-kq.toString().length();
            while (sl-->0){
            System.out.print("0");
            }
            System.out.println(kq);
        }
    }
    
}
