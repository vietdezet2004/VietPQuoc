
package tong_lap;
import java.util.*;
import java.math.*;

public class Tong_lap {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String s = input.nextLine();
        if(s.length() == 1){
            System.out.println(s);
        }
        else{
            while(s.length() > 1){
                BigInteger a = new BigInteger(s.substring(0, s.length() / 2));
                BigInteger b = new BigInteger(s.substring(s.length() / 2));
                s = a.add(b).toString();
                System.out.println(s);
            }
        }
    }
    
}
