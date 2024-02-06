package GreedyAlgorithm.MediumHard;

import java.util.*;

public class insertInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        int[][] ans = insert(intervals, newInterval);
        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i][0]+":"+ans[i][1]);
        }
    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for(int i=0; i<intervals.length; i++){
            if(intervals[i][1]<newInterval[0]){
                al.add(new ArrayList<>(Arrays.asList(intervals[i][0],intervals[i][1])));
            }else if(newInterval[1]<intervals[i][0]){
                al.add(new ArrayList<>(Arrays.asList(newInterval[0],newInterval[1])));
                newInterval[0]=intervals[i][0];
                newInterval[1]=intervals[i][1];
            }else{
                newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
                newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            }
        }
        al.add(new ArrayList<>(Arrays.asList(newInterval[0],newInterval[1])));
        int[][] ans = new int[al.size()][2];
        for(int i=0; i<al.size(); i++){
            ans[i][0] = al.get(i).get(0);
            ans[i][1]=al.get(i).get(1);
        } 
        return ans;   
    }
}
