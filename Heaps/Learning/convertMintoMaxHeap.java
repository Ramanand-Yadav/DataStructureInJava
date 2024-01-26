package Heaps.Learning;

public class convertMintoMaxHeap {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 6, 6};
        int[] ans = MinToMaxHeap(5, arr);
        for(int i=0; i<arr.length;i++){
            System.out.println(ans[i]);
        }
    }
    public static int[] MinToMaxHeap(int n, int[] arr){
        // Write your code here
        // int p = (n-2)/2;
        for(int i=(n-2)/2; i>=0; i--){
            heapify(i, arr,n);
        }
        int[] ans = new int[n];
        for(int i =0; i<n; i++){
            ans[i] = arr[i];
        }
        return ans;
    }
    private static void heapify(int ind, int[] arr, int n){
        int left = ind*2+1;
        int right = ind*2+2;
        int large = ind;
        if(left<n && arr[left]>arr[large])large=left;
        if(right<n && arr[right]>arr[large])large=right;
        if(ind!=large){
            int temp = arr[large];
            arr[large] = arr[ind];
            arr[ind] = temp;
            heapify(large, arr, n);
        }
    }
}
