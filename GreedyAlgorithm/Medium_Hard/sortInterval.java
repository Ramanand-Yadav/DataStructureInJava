package GreedyAlgorithm.Medium_Hard;

import java.util.*;


public class sortInterval {
    static class Interval {
        int start;
        int end;
    
        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    public static void main(String[] args) {
        
    }
    public static ArrayList<Interval> mergeIntervals(ArrayList<Interval> intervals) {
    // Write your code here.
        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval a, Interval b){
                return a.start-b.start;
            }
        });
        ArrayList<Interval>al = new ArrayList<>();
        al.add(intervals.get(0));
        for(int i=1; i<intervals.size();i++){
            if(al.get(al.size()-1).end < intervals.get(i).start){
                al.add(intervals.get(i));
            }else{
                al.get(al.size()-1).end = Math.max(al.get(al.size()-1).end, intervals.get(i).end);
            }
        }
        return al;
    }
    public static int[][] merge(int[][] intervals) {
        ArrayList<ArrayList<Integer>>al=new ArrayList<>();
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]-b[0];
            }
        });
        
        int st=intervals[0][0];
        int en=intervals[0][1];
        for(int i=1; i<intervals.length; i++){
            if(en<intervals[i][0]){
                al.add(new ArrayList<>(Arrays.asList(st,en)));
                st=intervals[i][0];en=intervals[i][1];
            }
            else if(st>intervals[i][1]){
                al.add(new ArrayList<>(Arrays.asList(intervals[i][0],intervals[i][1])));
            }else{
                st=Math.min(st,intervals[i][0]);
                en=Math.max(en,intervals[i][1]);
            }
        }
        al.add(new ArrayList<>(Arrays.asList(st,en)));
        int[][] ans = new int[al.size()][2];
        for(int i=0; i<al.size(); i++){
            ans[i][0]=al.get(i).get(0);
            ans[i][1]=al.get(i).get(1);
        }
        return ans;
    }
}
