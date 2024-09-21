
package j01021_tinh_luy_thua;
import java.math.*;
import java.util.*;
public class J01021_Tinh_luy_thua {
    public static final int MOD = (int)1e9+7;
    public static long luy_thua(long a,long b){
        if (b==0){
            return 1;
        }
        if (b==1){
            return a%MOD;
        }
        long tmp = luy_thua(a,b/2);
        
        if(b%2==0){
            return (tmp*tmp)%MOD;
        }
        return (((tmp*tmp)%MOD)*a)%MOD;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        while(true){
        long a = input.nextLong();
        long b = input.nextLong();
        if (a==0||b==0){
            return;
        }
        System.out.println(luy_thua(a,b));
    }
}