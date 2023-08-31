package Arrays.Hard;
import java.util.*;
public class numberOfInversion {
    public static void main(String[] args) {
        
    }
    
}
class Solution {
    public static int numberOfInversions(int []a, int n) {
        // Write your code here.
        return mergeSort(a, 0, n-1);
        
    }

    private static int mergeSort(int[] arr, int l, int r){
        int cnt = 0;
        if(l>=r) return cnt;

        int mid = (l+r)/2;
        cnt += mergeSort(arr, l, mid);
        cnt += mergeSort(arr, mid+1, r);

        cnt += merge(arr,l,mid,r);
        return cnt;
    }

    private static int merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer>al = new ArrayList<>();
        int left = low;
        int right = mid+1;
        int cnt = 0;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                al.add(arr[left]);
                left++;
            }else{
                al.add(arr[right]);
                cnt += (mid-left+1);
                right++;
            }
        }

        while(left<=mid){
            al.add(arr[left]);
            left++;
        }

        while(right<=high){
            al.add(arr[right]);
            right++;
        }

        for(int i=low; i<=high; i++){
            arr[i] = al.get(i-low);
        }
        return cnt;
    }
}
