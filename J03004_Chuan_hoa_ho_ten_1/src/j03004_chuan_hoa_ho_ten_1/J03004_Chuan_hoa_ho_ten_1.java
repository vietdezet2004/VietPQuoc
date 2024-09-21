/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03004_chuan_hoa_ho_ten_1;

/**
 *
 * @author Hello
 */
import java.util.*;
import java.math.*;
import java.lang.*;

public class J03004_Chuan_hoa_ho_ten_1 {
    static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static String chuanHoa(String s){
        StringBuilder kq = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()){
            String Tung_tu = st.nextToken();
            kq.append(Character.toUpperCase(Tung_tu.charAt(0)));
            for(int i=1;i<Tung_tu.length();i++){
                kq.append(Character.toLowerCase(Tung_tu.charAt(i)));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int t= input.nextInt();
        input.nextLine();
        while (t-->0){
            String s = input.nextLine();
            System.out.println(chuanHoa(s));
        }
    }
    
}
