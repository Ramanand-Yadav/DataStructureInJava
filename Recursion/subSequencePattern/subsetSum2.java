package Recursion.subSequencePattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetSum2 {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        printSubsets(arr);
    }
    public static void printSubsets(int input[]) {
		// Write your code here
		List<List<Integer>>ans = new ArrayList<>();
		Arrays.sort(input);
		solve(0,ans,input,new ArrayList<>());
		for(List<Integer>al:ans){
			for(int val : al){
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}
	public static void solve(int ind, List<List<Integer>>ans,int[] arr, List<Integer>al){
		ans.add(new ArrayList<>(al));
		for(int i=ind; i<arr.length; i++){
			if(i!=ind && arr[i]==arr[i-1]) continue;
			al.add(arr[i]);
			solve(i+1,ans,arr,al);
			al.remove(al.size()-1);
		}
	}
}
