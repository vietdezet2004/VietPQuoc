
package xoay_xau;
import java.util.*;
public class Xoay_xau {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n= input.nextInt();
        String[] arr = new String[n];
        for (int i=0;i<n;i++){
            arr[i]=input.next();
        }
        int kq = findMinSteps(arr);
        if(kq==-1){
            System.out.println("NO");
        }
        else{
            System.out.println(kq);
        }
    }
    public static int findMinSteps(String[] arr){
        String target = arr[0];
        int n = arr.length;
        int minSteps=Integer.MIN_VALUE;
        for(String s:arr){
            String doubled=s+s;
            if(!doubled.contains(target)){
                return -1;
            }
            int steps = doubled.indexOf(target);
            minSteps=Math.max(minSteps,steps);
        }
        return minSteps;
    }
}
