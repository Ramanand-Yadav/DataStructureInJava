package BinarySearch.BSON1DArray;

import java.util.ArrayList;

public class firstLastElement {
    public static void main(String[] args) {
        
    }
    public static int[] firstAndLastPosition(ArrayList<Integer> al, int n, int k) {
        // Write your code here.
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = al.get(i);
        }
        int left = findLeft(arr, k);
        if(left==Integer.MAX_VALUE) left = -1;
        int right = findRight(arr, k);
        int[] ans = {left, right};
        return ans;
    }

    private static int findLeft(int[] nums, int t){
        int l=0;
        int r=nums.length-1;
        int ans = Integer.MAX_VALUE;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]==t){
                ans = Math.min(ans, mid);
                r = mid-1;
            }else if(nums[mid]>t){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }
    private static int findRight(int[] nums, int t){
        int l=0;
        int r=nums.length-1;
        int ans = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]==t){
                ans = Math.max(ans, mid);
                l = mid+1;
            }else if(nums[mid]>t){
                r=mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }
}
