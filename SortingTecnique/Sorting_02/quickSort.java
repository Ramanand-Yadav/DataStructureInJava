package SortingTecnique.Sorting_02;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};
        quickSorting(arr, 0, 7);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    private static void quickSorting(int[] arr, int low, int high){
        
        if(low > high) return;
        int pInd = partition(arr, low, high);

        quickSorting(arr, low, pInd-1);
        quickSorting(arr, pInd+1, high);
    }

    private static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i =low;
        int j = high;
        while(i<j){
            while(arr[i]<=pivot && i<high){
                i++;
            }
            while(arr[j]>pivot && j>low){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;
    }

    private static void swap(int[] arr, int l, int h){
        int temp = arr[l];
        arr[l] = arr[h];
        arr[h] = temp;
    }
    
}
