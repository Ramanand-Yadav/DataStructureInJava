package GreedyAlgorithm.Medium_Hard;

import java.util.*;
import java.util.Comparator;

public class MaxProfit {
    static class Pair{
        int id;
        int time; 
        int profit;
        Pair(int id, int time, int profit){
            this.id = id;
            this.time = time; 
            this.profit = profit;
        }
    }
    static class sorting implements Comparator<Pair>{
        public int compare(Pair a, Pair b){
            if(a.time>b.time)return 1;
            else if(a.time<b.time) return -1;
            else{
                if(a.profit<=b.profit)return 1;
                else return -1;
            }
        }
    }
    public static void main(String[] args) {
        int[][] jobs = {{1,2,30},{2,2,40},{3,1,10},{4,1,10}};
        int[] ans = jobScheduling(jobs);
        System.out.println(ans[0]+" "+ans[1]);
    }
    public static int[] jobScheduling(int [][]jobs) {
        // Write your code here
        Pair[] arr = new Pair[jobs.length];
        for(int i=0; i<jobs.length; i++){
            Pair p = new Pair(jobs[i][0], jobs[i][1], jobs[i][2]);
            arr[i] = p;
        }
        Arrays.sort(arr,(a,b)->(b.profit-a.profit));
        int maxi = 0;
        for(int i=0; i<arr.length; i++){
            maxi = Math.max(maxi,arr[i].time);
        }
        int[] result = new int[maxi+1];
        Arrays.fill(result, -1);
        int cnt = 0;
        int p = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=arr[i].time; j>0; j--){
                if(result[j]==-1){
                    p+=arr[i].profit;
                    result[j] = arr[i].id;
                    cnt++;
                    break;
                }
            }
        }
        
        int[] ans = new int[2];
        ans[0]=cnt;
        ans[1]=p;
        return ans;
    }
}
