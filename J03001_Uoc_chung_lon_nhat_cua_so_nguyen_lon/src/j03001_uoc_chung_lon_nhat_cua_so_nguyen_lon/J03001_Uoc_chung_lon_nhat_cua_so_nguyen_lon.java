/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03001_uoc_chung_lon_nhat_cua_so_nguyen_lon;

/**
 *
 * @author Hello
 */
import java.util.*;
import java.math.*;
public class J03001_Uoc_chung_lon_nhat_cua_so_nguyen_lon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t  = input.nextInt();
        while(t-->0){
            BigInteger a = input.nextBigInteger();
            BigInteger b = input.nextBigInteger();
            System.out.println(a.gcd(b));
        }
            
    }
    
}
// import java.util.*;
// import java.math.*;
// BigInteger xử lí các phép tính với số nguyên lớn
