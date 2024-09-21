
package code_ptit;

import java.util.*;
import java.math.*;

public class J01011_Uocsochung_Boisochung {
    static Scanner input = new Scanner(System.in);
    public static long gcd(long a, long b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static long lcm(long a,long b){
        return (a*b)/gcd(a,b);
    }
    public static void main(String[] args) {
        int t=input.nextInt();
        while (t-->0){
            long m = input.nextLong();
            long n = input.nextLong();
            System.out.println(lcm(m,n) + " "+ gcd(m,n));
        }
    }
    
}
