package GreedyAlgorithm.Easy;
import java.util.*;

public class fractionalKnapsack {
    static class Pair{
        int weight;int value;
        Pair(int value, int weight){
            this.weight = weight;
            this.value = value;
        }
    }
    static class PairComparator implements Comparator<Pair>{
        public int compare(Pair a, Pair b){
            double r1 = (double)a.value/(double)a.weight;
            double r2 = (double)b.value/(double)b.weight;
            if(r1<r2)return 1;
            else if(r1>r2) return -1;
            return 0;
        }
    }
    public static void main(String[] args) {
        Pair[] items = {new Pair(100, 20), new Pair(60, 10),new Pair(120, 30)};
        int n = 3; int w = 50; 
        System.out.println(maximumValue(items, n, w));
    }
    public static double maximumValue(Pair[] items, int n, int w) {
            // Write your code here.
    	    // ITEMS contains {weight, value} pairs.
            Arrays.sort(items, new PairComparator());
            double ans = 0; 
            int currw = 0;
            for(int i=0; i<items.length; i++){
                Pair p = items[i];
                if(currw+p.weight<=w){
                    ans+=p.value;
                    currw+=p.weight;
                }else{
                    int remW = w-currw;
                    ans += ((double)p.value/(double)p.weight)*(double)remW;
                    currw+=remW;
                }
            }
            return ans;
    }
}
