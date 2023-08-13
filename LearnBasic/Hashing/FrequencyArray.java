package LearnBasic.Hashing;

import java.util.Arrays;

public class FrequencyArray {
    public static void main(String[] args){
        int n = 10, x=14;
        int[] nums = {11,14,8,3,12,14,1,7,4,3}; 
        int[] arr = countFrequency(n, x, nums);
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.
        int[] arr = new int[n];
        Arrays.fill(arr, 0);
        for(int i=0; i<n; i++){
            if((nums[i]-1)<n){
                arr[nums[i]-1]++;
            }
        }
        return arr;
    }
    
}
