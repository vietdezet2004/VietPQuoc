import java.util.Scanner;

public class J01001_Hinh_chu_nhat {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if(a<=0||b<=0)
            System.out.print("0");
        else 
            System.out.print((a+b)*2 + " " + a*b);
        input.close();
    }
}
