
package j02007_demsolanxuathien;
import java.util.*;
import java.math.*;
import java.lang.*;

public class J02007_Demsolanxuathien {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int t = input.nextInt();
        for(int v=1;v<=t;v++){
            int n = input.nextInt();
            int[] a = new int[n];
            for (int i=0;i<n;i++){
                a[i] = input.nextInt();
            }
            System.out.println("Test "+v+":");
            boolean[] b = new boolean[100005];
            for (int i=0;i<n;i++){
                if(b[a[i]]==false){
                    int cnt=1;
                    int j=i+1;
                    while (j<n){
                        if (a[i]==a[j]){
                            cnt++;
                        }
                        j++;
                    }
                    b[a[i]]=true;
                    System.out.println(a[i]+" xuat hien "+cnt+" lan");
                }
            }
            
        }
    }
    
}
