package j01024_so_tam_phan;
import java.util.*;
import java.math.*;
public class J01024_So_tam_phan {
    static Scanner input = new Scanner(System.in);
    static int testCase(int a){
        int kq=0;
        while (a>0){
            int sc=a%10;
            a/=10;
            if (sc!=1 && sc!=2 && sc!=0){
                return kq;
            }
        }
        kq=1;
        return kq;
    }
    public static void main(String[] args) {
        int t = input.nextInt();
        while (t-->0){
            int n=input.nextInt();
            if (testCase(n)==1){
                System.out.print("YES\n");
            }
            else {
                System.out.print("NO\n");
            }
        }
            
    }
    
}
