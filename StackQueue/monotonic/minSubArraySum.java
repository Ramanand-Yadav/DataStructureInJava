package StackQueue.monotonic;

import java.util.Scanner;

public class minSubArraySum {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)){
            System.out.print("Enter the size of the array : ");
            int n = scn.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter "+n+" Elements in the array : ");
            for(int i=0; i<n; i++){
                arr[i]=scn.nextInt();
            }
            int sum = sumSubarrayMins(arr);
            System.out.println("Sub Array sum min : "+sum);
        }
    }
    public static int sumSubarrayMins(int []arr) {
        // Write your code here.
        int ans = 0;
        int j=0;
        int n = arr.length; 
        while(j<n){
            int i = j; 
            int minEle = arr[j];
            while(i<n){
                if(minEle>arr[i]){
                    minEle=arr[i];
                }
                ans+=minEle;
                i++;
            }
            j++;
        }
        return ans;
    }
}
