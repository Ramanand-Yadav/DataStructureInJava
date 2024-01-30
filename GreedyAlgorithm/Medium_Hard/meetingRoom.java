package GreedyAlgorithm.Medium_Hard;

import java.util.Arrays;
import java.util.Comparator;

public class meetingRoom {
    static class Pair{
        int st;
        int end;
        Pair(int st, int end){
            this.st=st;
            this.end=end;
        }
    }

    static class PairComparator implements Comparator<Pair>{
        public int compare(Pair a, Pair b){
            if(a.end>b.end)return 1;
            else if(a.end<b.end)return -1;
            else return 0;
        }
    }
    public static void main(String[] args) {
        
    }
    public static int maximumMeetings(int []start, int []end) {
        Pair[] arr = new Pair[start.length];
        for(int i=0; i<start.length; i++){
            arr[i] = new Pair(start[i],end[i]);
        }
        Arrays.sort(arr,new PairComparator());
        if(start.length==1)return 1;
        // Write your code here.
        // return helper(arr,0,0,-1);
        int cnt =1;
        int e = arr[0].end;
        for(int i=1; i<arr.length; i++){
            if(e<arr[i].st){
                e=arr[i].end;
                cnt++;
            }
        }
        return cnt;
    }
}
