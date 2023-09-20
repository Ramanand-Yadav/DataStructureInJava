package Arrays.Medium;

public class sortColor{
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 1, 1, 0, 0, 2};
        solve(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    private static void solve(int[] arr){
        int i=0,j=0,k=arr.length-1;
        while(i<=k){
            if(arr[i]==2){
                swap(arr, i, k);
                k--;
            }else if(arr[i]==1){
                i++;
            }else{
                swap(arr,i,j);
                i++;j++;
            }
        }
    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
