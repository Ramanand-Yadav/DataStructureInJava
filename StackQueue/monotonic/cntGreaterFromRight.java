package StackQueue.monotonic;

import java.util.Scanner;

public class cntGreaterFromRight {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)){
            System.out.print("Enter number of value in the array: ");
            int n = scn.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter "+n+" Element in the array : ");
            for(int i=0; i<n; i++){
                arr[i] = scn.nextInt();
            }
            System.out.print("Enter the Number of Query : ");
            int q = scn.nextInt();
            int[] query = new int[q];
            System.out.print("Enter the "+q+" query : ");
            for(int i=0; i<q; i++){
                query[i] = scn.nextInt();
            }
            int[] ans = countGreater(arr, query);
            for(int val : ans){
                System.out.print(val+" ");
            }
        };
    }
    public static int[] countGreater(int []arr, int []query) {
        // Write your code here.
        int[] cntarr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            int val = arr[i];
            int cnt = 0;
            for(int j=i+1; j<arr.length;j++){
                if(val<arr[j]){
                    cnt++;
                }
            }
            cntarr[i]=cnt;
        }
        int[] ans = new int[query.length];
        for(int i=0; i<query.length; i++){
            ans[i] = cntarr[query[i]];
        }
        return ans;
    }
}
/*
 8 3
1 3 6 5 8 9 13 4
0 1 5

 */
