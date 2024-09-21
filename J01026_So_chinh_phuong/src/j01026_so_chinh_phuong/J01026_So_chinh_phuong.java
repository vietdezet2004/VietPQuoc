/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01026_so_chinh_phuong;

/**
 *
 * @author Hello
 */
import java.util.*;
import java.math.*;

public class J01026_So_chinh_phuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0){
            int n = input.nextInt();
            if ((int)(Math.sqrt(n))*(int)(Math.sqrt(n)) == n){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
