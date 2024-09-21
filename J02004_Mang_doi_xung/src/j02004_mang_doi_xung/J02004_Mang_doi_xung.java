
package j02004_mang_doi_xung;
import java.util.*;

public class J02004_Mang_doi_xung {
    
    static Scanner input = new Scanner(System.in);
    
    static boolean testCase(){
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        for (int i=0;i<=n/2;i++){
            if (a[i]!=a[n-i-1]){
                return false;
            }
        }
            return true;
    }
    public static void main(String[] args) {
        int t=input.nextInt();
        while (t-->0){
            if (testCase()){
                System.out.print("YES\n");
            }
            else {
                System.out.print("NO\n");
            }
        }
    }
    
}
