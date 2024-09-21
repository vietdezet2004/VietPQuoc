
package uoc_so_nguyen_to_lon_nhat;
import java.util.*;
import java.math.*;
public class Uoc_so_nguyen_to_lon_nhat {
    public static Scanner input = new Scanner(System.in);
    public static long UocNguyento_max(long a){
        if (a<2) 
            return 1;
        while (a%2==0){
            a/=2;
        }
        if (a==1)
            return 2;
        long lonnhat = 1;
        for (int i=3;i<Math.sqrt(a);i+=2){
            while (a%i==0){
                a/=i;
                lonnhat=i;
            }
        }
        if(a>lonnhat){
            return a;
        }
        else{
            return lonnhat;
        }
    }
    public static void main(String[] args) {
        int test = input.nextInt();
        while (test-->0){
            long n = input.nextLong();
            long kq = UocNguyento_max(n);
            System.out.println(kq);
        }
    }
    
}
