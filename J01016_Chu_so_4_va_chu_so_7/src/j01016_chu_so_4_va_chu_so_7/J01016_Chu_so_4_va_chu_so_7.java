import java.util.Scanner;
public class J01016_Chu_so_4_va_chu_so_7 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] n = input.nextLine().toCharArray();
        int count = 0;
        for (char i:n) 
            if (i == '4' || i == '7')   count++;
        if(count==4||count==7)
            System.out.print("YES");
        else 
            System.out.print("NO");
        input.close();
    }
}
