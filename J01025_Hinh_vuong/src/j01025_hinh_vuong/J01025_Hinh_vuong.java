package j01025_hinh_vuong;
import java.util.*;
import java.math.*;

public class J01025_Hinh_vuong {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int xmin=1001,xmax=-1001,ymin=1001,ymax=-1001;
        int x1 = input.nextInt();
        if (x1>xmax){
            xmax=x1;
        }
        if (x1<xmin){
            xmin=x1;
        }
        
        int y1 = input.nextInt();
        if (y1>ymax){
            ymax=y1;
        }
        if (y1<ymin){
            ymin=y1;
        }
        
        int x2 = input.nextInt();
        if (x2>xmax){
            xmax=x2;
        }
        if (x2<xmin){
            xmin=x2;
        }
        
        int y2 = input.nextInt();
        if (y2>ymax){
            ymax=y2;
        }
        if (y2<ymin){
            ymin=y2;
        }
        
        int x3 = input.nextInt();
        if (x3>xmax){
            xmax=x3;
        }
        if (x3<xmin){
            xmin=x3;
        }
        
        int y3 = input.nextInt();
        if (y3>ymax){
            ymax=y3;
        }
        if (y3<ymin){
            ymin=y3;
        }
        
        int x4 = input.nextInt();
        if (x4>xmax){
            xmax=x4;
        }
        if (x4<xmin){
            xmin=x4;
        }
        
        int y4 = input.nextInt();
        if (y4>ymax){
            ymax=y4;
        }
        if (y4<ymin){
            ymin=y4;
        }
        
        if ((ymax-ymin)>(xmax-xmin)){
            System.out.print((ymax-ymin)*(ymax-ymin));
        }
        else{
            System.out.print((xmax-xmin)*(xmax-xmin));
        }
    }
    
}
