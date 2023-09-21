package BinarySearch.BSONAnswer;
// import java.util.*;
public class mBouquet {
    public static void main(String[] args) {
        
    }
}
/* 
    public static int roseGarden1(int[] arr, int k, int m) {
        long val = (long) m * k;
        int n = arr.length; // Size of the array
        if (val > n) return -1; // Impossible case.
        // Find maximum and minimum:
        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }

        for (int i = mini; i <= maxi; i++) {
            if (possible(arr, i, m, k))
                return i;
        }
        return -1;
    }
    public static boolean possible(int[] arr, int day, int m, int k) {
        int n = arr.length; // Size of the array
        int cnt = 0;
        int noOfB = 0;
        // Count the number of bouquets:
        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) {
                cnt++;
            } else {
                noOfB += (cnt / k);
                cnt = 0;
            }
        }
        noOfB += (cnt / k);
        return noOfB >= m;
    }
}
class Solution {
    public static int minDays(int[] bloomDay, int m, int k) {
        int mine = Integer.MAX_VALUE;
        int maxe = Integer.MIN_VALUE;
        int n = bloomDay.length;
        long val = (long) m*k;
        if(val>n) return -1;

        for(int i=0;i<n;i++){
            mine = Math.min(mine, bloomDay[i]);
            maxe = Math.max(maxe, bloomDay[i]);
        }

        for(int i=mine; i<=maxe; i++){
            if(isPosible(bloomDay,i,m,k)==true){
                return i;
            }
        }
        return -1;
    }

    private static boolean isPosible(int[] arr, int day, int m, int k){
        int cnt = 0;
        int nofb = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=day){
                cnt++;
            }else{
                nofb += cnt/k;
                cnt = 0;
            }
        }
        nofb += cnt/k;
        return nofb>=m;
    }
}
*/
