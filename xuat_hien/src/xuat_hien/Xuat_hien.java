package xuat_hien;
import java.util.*;

public class Xuat_hien {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int Test = input.nextInt();
        while(Test-->0){
            int N = input.nextInt();
            Integer[] a = new Integer[N];
            Map<Integer,Integer> fM = new LinkedHashMap<>();
            
            for (int i=0;i<N;i++){
                a[i]=input.nextInt();
                fM.put(a[i],fM.getOrDefault(a[i],0)+1);
            }
            Arrays.sort(a,(x,y) -> {
                int fX = fM.get(x);
                int fY = fM.get(y);
                if(fX!=fY){
                    return fY-fX;
                }
                else{
                    return 0;
                }
            });
            for (int i : a){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        input.close();
    }
    
}
