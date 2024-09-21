
package a.tap.hop.so.nguyen;
import java.util.*;
public class ATapHopSoNguyen {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Integer n = input.nextInt(), m = input.nextInt();
        TreeSet<Integer> a = new TreeSet<>();
        TreeSet<Integer> b = new TreeSet<>();
        int[] mark = new int[1005];
        for (int i = 0; i < n; i++) {
            Integer x = input.nextInt();
            a.add(x);
            mark[x] = 1;
        }
        for (int i = 0; i < m; i++) {
            Integer x = input.nextInt();
            b.add(x);
            if (mark[x] == 1)
                mark[x] = 3;
            else if (mark[x] == 0)
                mark[x] = 2;
        }

        for (Integer i:b)
            if (mark[i] == 3)
                System.out.print(i + " ");
        System.out.println();
        
        for (Integer i:a)
            if (mark[i] == 1)
                System.out.print(i + " ");
        System.out.println();
        
        for (Integer i:b)
            if (mark[i] == 2)
                System.out.print(i + " ");
        System.out.println();
        input.close();
    }
    
}
