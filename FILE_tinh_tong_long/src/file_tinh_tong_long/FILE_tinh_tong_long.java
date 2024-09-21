package file_tinh_tong_long;
import java.io.*;
import java.util.*;
public class FILE_tinh_tong_long {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        long kq=0;
        while(in.hasNext()){
            String s = in.next();
            try{
                int x = Integer.parseInt(s);
            }
            catch(NumberFormatException e){
                try{
                    long y=Long.parseLong(s);
                    kq+=y;
                }
                catch(NumberFormatException o){
                    
                }
            }
        }
        System.out.print(kq);
    }
    
}
