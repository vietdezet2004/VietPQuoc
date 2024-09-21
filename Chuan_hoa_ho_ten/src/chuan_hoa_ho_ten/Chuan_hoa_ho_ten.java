
package chuan_hoa_ho_ten;
import java.util.*;
public class Chuan_hoa_ho_ten {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int t = input.nextInt();
        while (t-- > 0) {
            int choice = input.nextInt();
            input.nextLine();
            String[] name = input.nextLine().toLowerCase().split("\\s+");
            int n = name.length;
            for (int i = 0; i < n; i++) 
                name[i] = name[i].substring(0, 1).toUpperCase() + name[i].substring(1);
            if (choice == 1) {
                System.out.print(name[n-1] + " ");
                for (int i = 0; i < n-1; i++)
                    System.out.print(name[i] + " ");
            }
            else {
                for (int i = 1; i < n; i++)
                    System.out.print(name[i] + " ");
                System.out.print(name[0]);
            }
            System.out.println();
        }
        input.close();
    }
}
