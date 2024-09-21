package j01006_tinh_so_fibonacy;
import java.util.Scanner;
public class J01006_Tinh_so_fibonacy {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int t = input.nextInt();
        long f[]=new long[94];

        f[1]=1;
        f[2]=1;
        for(int i=3;i<=92;i++){
            f[i]=f[i-1]+f[i-2];
        }
        for(int i=1;i<=t;i++){
            int n= input.nextInt();
            System.out.println(f[n]);
        }
    }
}
// độ dài của mảng <array name>.length;
// khai báo mảng trong java:  int a[] = new int[10]; không thể mở rộng mảng a ra nữa
// cách khác int[] a = new int[10],b; kh 