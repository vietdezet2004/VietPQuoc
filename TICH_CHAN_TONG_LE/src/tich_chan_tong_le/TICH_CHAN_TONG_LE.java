package tich_chan_tong_le;
import java.util.*;
import java.math.*;
public class TICH_CHAN_TONG_LE {

    public static Scanner input = new Scanner(System.in); 
    public static void main(String[] args) {
        int test = input.nextInt();
        input.nextLine();
        while (test-->0){    
            String N = input.nextLine();
            BigInteger multi=BigInteger.ZERO;
            int sum=0;
            for (int i=0;i<N.length();i++){
                char kt_so = N.charAt(i);
                int so = Character.getNumericValue(kt_so);
                if (i%2==0){
                    if(so!=0){
                        if(multi==BigInteger.ZERO){
                            multi=BigInteger.valueOf(so);
                        }
                        else{
                            multi = multi.multiply(BigInteger.valueOf(so));
                        }
                    }
                }
                else{
                    sum+=so;
                }
            }
            System.out.println(multi+" "+sum);
        }
    }
}
