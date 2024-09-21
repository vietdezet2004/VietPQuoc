
package j02008_boisonhonhat;
import java.util.*;
import java.math.*;
public class J02008_Boisonhonhat {
    public static long gcd(long a,long b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
    
    public static long lcm(long a,long b){
        return a*b/gcd(a,b);
    }
    
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int t = input.nextInt();
        while (t-->0){
            int n = input.nextInt();
            long res = 1;
            for (int i=2;i<=n;i++){
                res=lcm(res,i);
            }
            System.out.println(res);
        }
    }
    
}
