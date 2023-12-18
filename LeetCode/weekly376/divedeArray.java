package LeetCode.weekly376;

import java.util.*;
public class divedeArray {
    public static void main(String[] args) {
        int[] arr = {15,13,12,13,12,14,12,2,3,13,12,14,14,13,5,12,12,2,13,2,2};
        int k = 2;
        for(int val : arr){
            System.out.print(val+",");
        }
        System.out.println("Orginal Array");
        Arrays.sort(arr);
        for(int val : arr){
            System.out.print(val+",");
        }
        System.out.println("Sorted Array");
        int[][] ans = divideArray1(arr, k);
        for(int[] a : ans){
            for(int val : a){
                System.out.print(val+",");
            }
            System.out.println();
        }
    }
    public static int[][] divideArray1(int[] nums, int k) {
        if(nums.length%3!=0)return new int[0][0];
        int[][] ans = new int[(int)nums.length/3][3];
        Arrays.sort(nums);
        // ans[0][0]=nums[0];
        boolean flag=false;
        for(int i=0; i<nums.length; i++){
            if(i!=0 && i%3!=0){
                if(Math.abs(nums[i]-nums[i-1])>k){
                    flag=true;
                    break;
                }
                if(i%3==2){
                    if(Math.abs(nums[i]-nums[i-1])>k||Math.abs(nums[i]-nums[i-2])>k)
                    {
                        flag=true;
                        break;
                    }
                }
                // if(flag==true)break;
            }
            int row = i/3;
            int col = i%3;
            ans[row][col]=nums[i];
        }
        if(flag==true)return new int[0][0];
        return ans;
    }
}
