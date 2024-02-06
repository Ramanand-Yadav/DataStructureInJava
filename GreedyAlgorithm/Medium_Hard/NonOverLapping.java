import java.util.Arrays;
import java.util.Comparator;

class NonOverLapping {
    public static void main(String[] args) {
        
    }
    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){return a[0]-b[0];}
        });
        int cnt = 0;
        int last = intervals[0][1];
        for(int i=1; i<intervals.length; i++){
            if(last<=intervals[i][0]){
                last = intervals[i][1];
            }else{
                last = Math.min(last, intervals[i][1]);
                cnt++; 
            }
        }
        return cnt;
    }
}