package BinarySearch.BSONAnswer;
import java.util.* ;
import java.io.*; 
public class ShipCapacity {
    public static void main(String[] args) {
        
    }
}

class Solution {
    public static int leastWeightCapacity(int[] weights, int d) {
        // Write your code here.
        return shipWithinDays(weights, d);
    }

    public static int shipWithinDays(int[] weights, int days) {
        int maxe = Integer.MIN_VALUE;
        int n = weights.length; 
        int sum = 0;
        for(int i=0; i<n; i++){
            maxe = Math.max(weights[i], maxe);
            sum += weights[i];
        }

        // for(int i=maxe; i<=sum; i++){
        //     int cap = cal(weights, i,days);
        //     if(cap<=days) return i;
        // }
        int l = maxe; int r = sum;
        while(l<=r){
            int mid = (l+r)/2;
            int d = cal(weights, mid, days);
            if(d<=days){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        
        return l;
    }
    private static int cal(int[] arr, int cap, int days){
        int d = 1;
        int t = 0;
        for(int i=0; i<arr.length; i++){
            if(t+arr[i]>cap){
                t = arr[i];
                d++;
            }else{
                t += arr[i];
            }
        }
        return d;
    }
}