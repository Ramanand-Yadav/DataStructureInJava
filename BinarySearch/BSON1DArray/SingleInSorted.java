package BinarySearch.BSON1DArray;

public class SingleInSorted {
    public static void main(String[] args) {
        
    }
    public int singleNonDuplicate(int[] arr) {
        // int ans = -1;
        // int ans = 0;
        // for(int i=0; i<arr.length;i++){
        //     ans = ans ^ arr[i];
        // }
        // return ans;
        int n = arr.length;
        if(n==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];

        int l = 1, r=n-2;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) return arr[mid];
            else if((mid%2==0 && arr[mid]==arr[mid+1]) || (mid%2==1 && arr[mid]==arr[mid-1])){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return 0;
    }
}
