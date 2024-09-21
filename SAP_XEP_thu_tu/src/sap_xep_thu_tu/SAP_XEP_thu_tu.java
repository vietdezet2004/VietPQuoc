
package sap_xep_thu_tu;
import java.util.*;
class Number implements Comparable<Number> {
    public int value,firstIndex,cnt;
    public Number(int value,int firstIndex, int cnt){
        this.value = value;
        this.firstIndex = firstIndex;
        this.cnt = cnt;
    }
    public int compareTo(Number o){
        if(this.cnt==o.cnt){
            return this.firstIndex -o.firstIndex;
        }
        return -(this.cnt - o.cnt);
    }
}

public class SAP_XEP_thu_tu {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int Test = input.nextInt();
        while(Test-->0){
            Map<Integer,Integer> mapIndex = new HashMap<>();
            Map<Integer,Integer> mapCnt = new HashMap<>();
            int n = input.nextInt();
            for (int i=0;i<n;i++){
                int x = input.nextInt();
                if(!mapIndex.containsKey(x)){
                    mapIndex.put(x,i);
                    mapCnt.put(x,1);
                }
                else{
                    mapCnt.put(x, mapCnt.get(x)+1);
                }
            }
            List<Number> list = new ArrayList<>();
            for (Integer i : mapIndex.keySet()){
                int firstIndex = mapIndex.get(i);
                int cnt = mapCnt.get(i);
                list.add(new Number(i,firstIndex,cnt));
            }
            Collections.sort(list);
            for (Number e:list){
                for (int i=0;i<e.cnt;i++){
                    System.out.print(e.value +" ");
                }
            }
            System.out.println();
        }
    }
}
