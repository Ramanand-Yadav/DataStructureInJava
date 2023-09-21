package BinarySearch.BSONAnswer;
// import java.util.*;
public class findKthMissing {
    public static void main(String[] args) {
        
    }
}

class Solution {
    public static int missingK(int[] vec, int n, int k) {
        // Write your code here.
        // nt n = arr.length; 
        int l=0, r=n-1;
        while(l<=r){
            int mid = (l+r)/2;
            int mis = vec[mid]-(mid+1);
            if(mis<k) l = mid+1;
            else r = mid-1;
        }
        return l+k;
    }
}
