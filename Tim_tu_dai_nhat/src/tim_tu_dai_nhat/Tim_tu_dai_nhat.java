
package tim_tu_dai_nhat;
import java.util.*;
public class Tim_tu_dai_nhat {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String res = "";
        while(input.hasNext()){
            String s = input.nextLine();
            s.replaceAll("\\s+"," ");
            String[] words = s.split("\\s");
            for (String word:words){
                if (word.length()>res.length()){
                    res=word;
                }
            }
        }
        System.out.println(res+" - "+ res.length());
    }   
}
