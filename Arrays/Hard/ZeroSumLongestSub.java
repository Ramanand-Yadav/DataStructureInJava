package Arrays.Hard;

import java.util.HashMap;

public class ZeroSumLongestSub {
    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 1};
        System.out.println("longest length : "+getLongestZeroSumSubarrayLength(arr));
    }
    public static int getLongestZeroSumSubarrayLength1(int []arr){
        // Write your code here.
        int ans = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i;j<n;j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum+=arr[k];
                    System.out.print(arr[k]+" ");
                }
                if(sum == 0){
                    ans = Math.max(ans, j-i+1);
                }
                System.out.println();
            }
        }
        return ans;
    }
    public static int getLongestZeroSumSubarrayLength(int []arr){
        // Write your code here.
        int ans = 0;
        int n = arr.length;
        int sum = 0;
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++){
            // int sum = 0;
            // for(int j=i;j<n;j++){
            //     sum += arr[j];
            //     if(sum == 0){
            //         ans = Math.max(ans, j-i+1);
            //     }
            // }
            sum += arr[i];
            if(sum==0){
                ans = i+1;
            }
            if(mp.get(sum)!=null){
                ans = Math.max(ans, i-mp.get(sum));
            }else{
                mp.put(sum, i);
            }
        }
        return ans;
    }
}
