package j02011_sap_xep_chon_selection_sort;
import java.util.*;
public class J02011_Sap_xep_chon_SELECTION_SORT {
    public static Scanner input = new Scanner(System.in);
    public static void swap(int a,int b){
        int t1=a.getValue();
        int t2 = b.getValue();
        a=b;
        b=tg;
    }
    public static void main(String[] args) {
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = input.nextInt();
        }
        
        for (int i=0;i<n-1;i++){
            int minn = a[i];
            int vt=i;
            for (int j=i+1;j<n;j++){
                if (a[j]<minn){
                    vt=j;
                    minn = a[j];
                }
            }
            swap(a[i],a[vt]);
            System.out.print("Buoc "+(i+1)+": ");
            for (int k=0;k<n;k++){
                System.out.print(a[k]+" ");
            }
        }
    }
    
}
