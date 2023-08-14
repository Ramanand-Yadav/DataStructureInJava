package SortingTecnique.Sorting_02;

import java.util.ArrayList;

public class merge {
    public static void main(String[] args) {
        mergeSort(new int[]{2,13,4,1,3,6,28}, 0, 6);
    }

    private static void mergeSort(int[] arr, int l, int r){
        // Write your code here
        if(l>=r) return;

        int mid = (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);

        merge(arr,l,mid,r);
    }

    private static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> al = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                al.add(arr[left]);
                left++;
            }else{
                al.add(arr[right]);
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
    }
    
}
