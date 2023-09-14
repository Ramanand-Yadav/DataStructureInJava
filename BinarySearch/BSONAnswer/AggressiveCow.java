package BinarySearch.BSONAnswer;
import java.util.*;

public class AggressiveCow {
    public static void main(String[] args) {
        int n=6; int k = 4;
        int[] arr = {0,3,4,7,10,9};
        System.out.println("final answer : "+solve(arr, n, k));
    }

    private static int solve(int[] arr, int n, int k){
        Arrays.sort(arr);
        // int ans = 0;
        int max = arr[n-1]-arr[0];
        System.out.println("max answer "+max);
        int l = 1; int r = max;
        while(l<=r){
            int mid = (l+r)/2;
            if(ifCowPossible(arr, n, k, mid)==true){
                l = mid+1;
            }else{
                r = mid-1;
            }
            // if()
        }
        // for(int i=1; i<=max; i++){
        //     // System.out.println(i);
        //     boolean val = ifCowPossible(arr,n,k,i);
        //     if(val==true){
        //         ans = Math.max(i, ans);
        //     }
        // }
        return r;
    }
    private static boolean ifCowPossible(int[] arr, int n, int k, int gap){
        int cntcows = 1;
        int last = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]-last >= gap){
                cntcows++;
                last = arr[i];
            }
        }
        if(cntcows>=k) return true;
        return false;
    }
}
