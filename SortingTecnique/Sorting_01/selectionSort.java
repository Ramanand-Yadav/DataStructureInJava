package SortingTecnique.Sorting_01;

public class selectionSort {

    public static void main(String[] args) {
        selectionSort(new int[]{2,13,4,1,3,6,28});
    }
    public static void selectionSort(int[] arr) {
        //Your code goes here
        for(int i=0; i<arr.length; i++){
            int minIndex = i;
            for(int j=i; j<arr.length; j++){
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            if(minIndex==i){
                continue;
            }else{
                int val = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = val;
            }
        }
    }
    
}
