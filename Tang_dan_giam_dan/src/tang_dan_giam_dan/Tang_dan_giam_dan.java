 
package tang_dan_giam_dan;
import java.util.*;
public class Tang_dan_giam_dan {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {       
        int t = input.nextInt(); // Số bộ test
        while(t-->0) {
            int N = input.nextInt(); // Số phần tử của dãy
            Set<Integer> so_chan = new TreeSet<>();
            Set<Integer> so_le = new TreeSet<>(Collections.reverseOrder());

            for (int i = 0; i < N; i++) {
                int num = input.nextInt();
                if (num % 2 == 0) {
                    so_chan.add(num);
                } else {
                    so_le.add(num);
                }
            }

            // In các số chẵn theo thứ tự tăng dần
            for (int chan : so_chan) {
                System.out.print(chan + " ");
            }
            System.out.println();

            // In các số lẻ theo thứ tự giảm dần
            for (int le : so_le) {
                System.out.print(le + " ");
            }
            System.out.println();
        }
        
        input.close();
    }
}

