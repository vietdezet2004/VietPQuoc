
package j02010_sapxep_doichotructiep_interchange_sort;
import java.util.*;

public class J02010_Sapxep_Doichotructiep_INTERCHANGE_SORT {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0;i<n;i++){
            a[i] = input.nextInt();
        }
        for (int i = 0;i<n-1;i++){
           for (int j=i+1;j<n;j++){
               if(a[j]<a[i]){
                   int tg=a[j];
                   a[j]=a[i];
                   a[i]=tg;
               }
           }
           System.out.print("Buoc "+(i+1)+ ": ");
           for (int k = 0;k<n;k++){
               System.out.print(a[k]+ " ");
           }
           System.out.println();
        }
    }
    
}
