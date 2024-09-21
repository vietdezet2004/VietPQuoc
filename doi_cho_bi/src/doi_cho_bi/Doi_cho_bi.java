
package doi_cho_bi;
import java.util.*;
public class Doi_cho_bi {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n = input.nextInt();
        input.nextLine();
        String s = input.nextLine();
        int kq = minSwaps(s);
        System.out.print(kq);
    }
    public static int minSwaps(String s){
        char[] mau = s.toCharArray();
        int demT = 0, demX = 0,demD = 0;
        for(char a : mau ){
            if(a == 'T'){
                demT++;
            }
            else if (a == 'X'){
                demX++;
            }
            else if (a == 'D'){
                demD++;
            }
        }
        int[] targetPos = new int[]{demX,demX+demT};
        int[] saiX = new int[3];
        int[] saiT = new int[3];
        int[] saiD = new int[3];
        
        for (int i=0;i<mau.length;i++){
            if(i<targetPos[0]){
                if (mau[i]=='T') saiT[0]++;
                else if(mau[i]=='D') saiD[0]++;
            }
            else if(i<targetPos[1]){
                if(mau[i]=='X') saiX[1]++;
                else if (mau[i]=='D') saiD[1]++;
            }
            else {
                if(mau[i]=='X') saiX[2]++;
                else if (mau[i]=='T') saiT[2]++;
            }
        }
        int minSw=0;
        minSw +=Math.min(saiX[1], saiT[0]);
        minSw +=Math.min(saiX[2], saiD[1]);
        minSw +=Math.min(saiT[1], saiD[0]);
        
        int dcXD = Math.abs(saiX[1]=saiD[1])/2;
        int dcTD = Math.abs(saiT[1]=saiD[0])/2;
        minSw += dcXD+dcTD;
        return minSw;
    }
}
