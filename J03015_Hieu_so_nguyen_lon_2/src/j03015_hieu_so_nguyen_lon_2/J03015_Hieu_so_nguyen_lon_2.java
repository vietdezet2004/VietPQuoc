/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03015_hieu_so_nguyen_lon_2;

/**
 *
 * @author Hello
 */
import java.util.*;
import java.math.*;

public class J03015_Hieu_so_nguyen_lon_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // Tính hiệu A-B
        BigInteger a = input.nextBigInteger();
        BigInteger b = input.nextBigInteger();
        System.out.print(a.subtract(b));
    }
    
}
