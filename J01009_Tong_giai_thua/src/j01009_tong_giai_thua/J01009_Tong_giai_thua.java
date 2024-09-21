import java.util.Scanner;
// import là để khai báo thư viện

public class J01009_Tong_giai_thua {
    // tên class phải trùng với tên File.java
    static Scanner input = new Scanner(System.in);
    static void test_case () {
        int n = input.nextInt();
        // int n để khai báo số nguyên n, input.nextInt() để nhập n nguyên vào từ bàn phím
        long res = 0, m = 1;
        for (int i = 1; i <= n; i++) {
            m *= i;
            res += m;
        }
        System.out.println(res);
        // System.out.println("Cần in ra màn hình"); là câu lệnh để in ra màn hình
    }
    public static void main(String[] args) {
        // luôn luôn phải là // public static void main(String[] args)
        test_case();
    }
}