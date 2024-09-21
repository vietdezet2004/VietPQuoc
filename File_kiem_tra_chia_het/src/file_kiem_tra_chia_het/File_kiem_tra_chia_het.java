
package file_kiem_tra_chia_het;
import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class File_kiem_tra_chia_het {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("SONGUYEN.IN"));
        int t=Integer.parseInt(in.nextLine());
        while(t-->0){
            while (in.hasNextLine()){
                BigInteger n = new BigInteger(in.next());
                BigInteger m7 = new BigInteger("7");
                BigInteger m13 = new BigInteger("13");
                if (n.mod(m7).toString().equals("0") && n.mod(m13).toString().equals("0")){
                    System.out.println("Both");
                }
                else if(n.mod(m7).toString().equals("0")){
                    System.out.println("Div 7");
                }
                else if(n.mod(m13).toString().equals("0")){
                    System.out.println("Div 13");
                }
                else{
                    System.out.println("None");
                }
            }
        }
    }
    
}
