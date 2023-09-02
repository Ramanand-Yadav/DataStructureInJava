package BinarySearch.BSON1DArray;

import java.util.ArrayList;

public class RotatedSortedele {
    public static void main(String[] args) {
        
    }
    public static int search(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.

        int low = 0, high = n - 1,ans=-1;
        while (low <= high) {
            int mid = (low + high) / 2;

            // if mid points to the target
            if (arr.get(mid) == k){
                ans = mid;
                low=mid+1;
            }else if (arr.get(low) <= arr.get(mid)) {
                if (arr.get(low) <= k && k < arr.get(mid)) {
                    // element exists
                    high = mid - 1;
                } else {
                    // element does not exist
                    low = mid + 1;
                }
            } else { // if right part is sorted
                if (arr.get(mid) < k && k <= arr.get(high)) {
                    // element exists
                    low = mid + 1;
                } else {
                    // element does not exist
                    high = mid - 1;
                }
            }
        }
        return ans;
    }
}
