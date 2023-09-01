package BinarySearch.BSON1DArray;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5};
        int n = 3;
        binarySearch(arr, 0, n-1, 5);
        binarySearch1(arr, 0, n-1, 5);
        binarySearch2(arr, 0, n-1, 5);
    }

    private static int binarySearch(int[] arr, int low, int high, int target){
        if(low>high) return -1;
        int mid = (low+high)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]>target){
            return binarySearch(arr, low, mid-1, target);
        }else return binarySearch(arr, mid+1, high, target);
    }

    private static int binarySearch1(int[] nums, int low, int high, int target){
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch2(int[] nums, int low, int high, int target){
        int n = nums.length;
       int l=0;
       int r=n-1;
       
       while(l<=r){
           int mid = (l+r)/2;
           int ele = nums[mid];
           if(ele==target) return mid;
           else if(ele>target){
               r = mid-1;
           }else l = mid+1;
       }
        return -1;
    }
}
