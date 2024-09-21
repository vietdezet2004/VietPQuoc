
package dao_nguoc_cac_tu;
import java.util.*;
public class Dao_nguoc_cac_tu {
    public static Scanner input = new Scanner(System.in);
    public static String daonguoc_Tu(String s){
        String[] wordArray = s.split("\\s+");
        ArrayList<String> wordList = new ArrayList<>();
        Collections.addAll(wordList, wordArray);
        Collections.reverse(wordList);
        String reversed = String.join(" ", wordList);
        return reversed;
    }
    public static void main(String[] args) {
        int test = input.nextInt();
        input.nextLine();
        while(test-->0){
            String s = input.nextLine();
            String kq = daonguoc_Tu(s);
            System.out.println(kq);
        }
    }
    
}
