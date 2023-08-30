package Arrays.Hard;
import java.util.*;

public class mergeTwoIntervals {
    public static void main(String[] args) {
        
    }
}

class Solution {
    public int[][] merge(int[][] intervals) {
        // boolean[] mark = new boolean[intervals.length];
        List<List<Integer>> ans = new ArrayList<>();
        int n = intervals.length; 

        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]-b[0];
            }
        });

        // for(int i=0; i<n; i++){
        //     int st = intervals[i][0];
        //     int en = intervals[i][1];

        //     if(!ans.isEmpty() && ans.get(ans.size()-1).get(1)>=en) continue;

        //     for(int j=i+1; j<n; j++){
        //         if(en>=intervals[j][0]){
        //             en = Math.max(en, intervals[j][1]);
        //         }else{
        //             break;
        //         }
        //     }
        //     ans.add(Arrays.asList(st,en));


        // }
        ans.add(Arrays.asList(intervals[0][0], intervals[0][1]));
        for(int i=1; i<n; i++){
            int st = intervals[i][0];
            int en = intervals[i][1];

            int lend = ans.get(ans.size()-1).get(1);

            if(st<=lend){
                ans.get(ans.size()-1).set(1,Math.max(en, lend));
            }else{
                ans.add(Arrays.asList(st, en));
            }
        }
        int[][] arr = new int[ans.size()][2];
        int i = 0;
        for(List<Integer> al : ans){
            arr[i][0] = al.get(0);
            arr[i][1] = al.get(1);
            i++;
        }
        return arr;

    }
}