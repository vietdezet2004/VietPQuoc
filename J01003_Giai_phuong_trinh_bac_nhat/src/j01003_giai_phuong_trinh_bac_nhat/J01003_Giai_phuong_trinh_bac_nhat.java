import java.util.*;

public class J01003_Giai_phuong_trinh_bac_nhat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        if (a == 0 && b == 0)   System.out.println("VSN");
        else if (a == 0 && b != 0)  System.out.println("VN");
        else    System.out.format("%.2f", -b/a);
        input.close();
    }
    
}
