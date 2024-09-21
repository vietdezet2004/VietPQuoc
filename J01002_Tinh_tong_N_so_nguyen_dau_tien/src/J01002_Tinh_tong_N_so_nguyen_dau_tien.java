import java.util.Scanner;
public class J01002_Tinh_tong_N_so_nguyen_dau_tien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=1;i<=t;i++){
            long n = input.nextLong();
            System.out.println(n * (n + 1) / 2);
        }
        input.close();
    }
}
