package j02006_hopcua2dayso;
import java.util.*;

public class J02006_Hopcua2dayso {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n = input.nextInt();
        int m = input.nextInt();
        boolean[] c = new boolean[1005];
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i=0;i<n;i++){
            a[i] = input.nextInt();
            c[a[i]] = true;
        }
        for (int i=0;i<m;i++){
            b[i]= input.nextInt();
            c[b[i]] = true;
        }
        for (int i=0;i<1005;i++){
            if (c[i]==true){
                System.out.print(i+" ");
            }
        }
        
    }
    
}
