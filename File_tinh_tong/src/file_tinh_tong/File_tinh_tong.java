
package file_tinh_tong;
import java.io.*;
import java.util.*;
public class File_tinh_tong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("DATA.in"));
        long kq=0;
        while (input.hasNext()){
            String s = input.next();
            try{
                int x = Integer.parseInt(s);
                kq+=x;
            }
            catch(NumberFormatException e){
                
            }
        }
        System.out.print(kq);
    }
    
}
