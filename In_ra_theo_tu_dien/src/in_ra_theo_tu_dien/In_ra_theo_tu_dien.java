
package in_ra_theo_tu_dien;
import java.util.*;

public class In_ra_theo_tu_dien {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int Test= input.nextInt();
        input.nextLine();
        while(Test-->0){
            String s = input.nextLine().trim();
            char[] char_array = s.toCharArray();
            Arrays.sort(char_array);
            String res = "";
            int sum=0;
            for (int i=0;i<char_array.length;i++){
                if (char_array[i]>='0' && char_array[i]<='9'){
                    sum+=char_array[i]-'0';
                }
                else{
                    res +=char_array[i];
                }
            }
            res=res+Integer.toString(sum);
            System.out.println(res);
        }
    }
    
}
