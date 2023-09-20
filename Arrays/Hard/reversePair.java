package Arrays.Hard;

// import java.util.ArrayList;
// import java.util.List;

public class reversePair {
    public static void main(String[] args) {
        
    }

    // private static int countPairs(int[] arr, int l, int mid, int r){
    //     int cnt = 0;
    //     int right = mid+1;
    //     for(int i=l; i<=mid; i++){
    //         while(right<=r && arr[i]>(long)2*arr[right]) right++;
    //         cnt += (right-(mid+1));
    //     }
    //     return cnt;
    // }

    // private static int mergeSort(int[] arr, int l, int r){
    //     int cnt = 0;
    //     if(l>=r) return cnt;

    //     int mid = (l+r)/2;
    //     cnt += mergeSort(arr, l, mid);
    //     cnt += mergeSort(arr, mid+1, r);
    //     cnt += countPairs(arr, l, mid, r);
    //     merge(arr, l, mid, r);
    //     return cnt;
    // }

    // private static void merge(int[] arr, int low, int mid, int high){
    //     List<Integer> al = new ArrayList<>();
    //     int left = low; 
    //     int right = mid+1;

    //     while(left<=mid && right<=high){
    //         if(arr[left]<=arr[right]){
    //             al.add(arr[left]);
    //             left++;
    //         }else{
    //             al.add(arr[right]);
    //             right++;
    //         }
    //     }

    //     while(left<=mid){
    //             al.add(arr[left]);
    //             left++;
    //         }
    //     while(right<=high){
    //         al.add(arr[right]);
    //         right++;
    //     }

    //     for(int i=low; i<=high; i++){
    //         arr[i] = al.get(i-low);
    //     }

    // }
}
