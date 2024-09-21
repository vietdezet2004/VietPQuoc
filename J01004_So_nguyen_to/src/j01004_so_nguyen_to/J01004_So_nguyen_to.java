import java.util.Scanner;


public class J01004_So_nguyen_to {
    static Scanner input = new Scanner(System.in);
    public static boolean Ktra_ngto(long n){
        for(int i=2 ; i <= Math.sqrt(n); i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    static void test_case(){
        long n = input.nextLong();
        if(Ktra_ngto(n)==true) 
            System.out.println("YES");
        else 
            System.out.println("NO");
    }
    public static void main(String[] args) {
        int t = input.nextInt();
        for(int i=1;i<=t;i++){
            test_case();
        }
    }
}
