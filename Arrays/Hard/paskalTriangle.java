package Arrays.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class paskalTriangle {
    public static void main(String[] args) {
        List<List<Integer>> al = generate(5);
        for(List<Integer> al1 : al){
            System.out.println(al1);
        }
        System.out.println(findElementAtRC(4, 3));
        List<Integer> nthRow = printNthRow(5);
        System.out.println("nth row : "+nthRow);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al = new ArrayList<>();
        List<Integer> al1 = new ArrayList<>();
        al1.add(1);
        al.add(al1);
        if(numRows==1){
            return al;
        }
        List<Integer> al2 = new ArrayList<>();
        al2.add(1);al2.add(1);
        al.add(al2);
        if(numRows==2){
            return al;
        }
        for(int i=2; i<numRows; i++){
            List<Integer> al3 =  new ArrayList<>(i+1);
            al3.add(1);
            for(int j=1; j<i; j++){
                // List<Integer> prev = al.get(i-1);
                int f = al.get(i-1).get(j-1);
                int s = al.get(i-1).get(j);
                al3.add((f+s));
            }
            al3.add(1);
            al.add(al3);
        }
        return al;
    }

    //find element at position r and c in pascal triangle. 
    private static int findElementAtRC(int r, int c){
        int val =(int) ncr(r-1,c-1);
        return val;
    }

    private static long ncr(int n, int r){
        long res = 1;
        for(int i=0; i<r; i++){
            res = res*(n-i);
            res = res/(i+1);
        }
        return res;
    }
    //print nth row of pascal triangle
    private static List<Integer> printNthRow(int n){
        List<Integer> al = new ArrayList<>();
        // for(int i=1; i<=n; i++){
        //     int val = (int) ncr(n-1,i-1);
        //     al.add(val);
        // }
        al.add(1);
        int ans = 1;
        for(int i=1; i<n; i++){
            ans = ans *(n-i);
            ans = ans/i;
            al.add(ans);
        }
        return al;
    }
}
