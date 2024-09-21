
package file_loai_bo_so_nguyen;
import java.io.*;
import java.util.*;
public class File_loai_bo_so_nguyen {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        ArrayList<String> list = new ArrayList<>();
        while(in.hasNext()){
            String s = in.next();
            try{
                int n = Integer.parseInt(s);
            }
            catch(NumberFormatException e){
                list.add(s);
            }
        }
        Collections.sort(list);
        for (String i:list){
            System.out.print(i+" ");
        }
    }
    
}
