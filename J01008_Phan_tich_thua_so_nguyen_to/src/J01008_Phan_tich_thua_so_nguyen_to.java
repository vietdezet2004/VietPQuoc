import java.util.Scanner;
public class J01008_Phan_tich_thua_so_nguyen_to {
    static Scanner input = new Scanner(System.in);
    static void solution(long n) {
        int i=2,dem=0;
        while (n>=i){
            while(n%i==0){
                n=n/i;
                dem++;
            }
            if(dem!=0){
                System.out.print(i+"("+dem+") ");
                dem=0;
            }
            i++;
        }
    }
    static void test_case(int t){
        int n = input.nextInt();
        System.out.print("Test "+t+": ");
        solution(n);
        System.out.println();
    }
    public static void main(String[] args) {
       int t = input.nextInt();
       for(int i=1;i<=t;i++)
           test_case(i);
    }
    
}
