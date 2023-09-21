package Arrays.Medium;
// import java.util.*;
public class rearrange {
    static int p;
    static int n;
    public static void main(String[] args) {
        int[] arr = {28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
        rearrangeArray(arr);
    }
    private static int[] rearrangeArray(int[] nums) {
        p=setPositive(nums,0);
        n=setNegative(nums,0);
        //{28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
        int i=0;
        while(i<nums.length){
            //set positve
            if(p==i){
                p = setPositive(nums,p+1);
                i++;
            }else{
                swap(nums,p,i);
                p = setPositive(nums,p+1);
                i++;
            }

            //set negative
            if(n==i){
                n = setNegative(nums,n+1);
                i++;
            }else{
                swap(nums,n,i);
                n = setNegative(nums,n+1);
                i++;
            }
        }
        return nums;
    }
    private static void swap(int[] nums, int st, int i){
        if(nums[i]>0){
            p=st;
            n=i;
        }
        if(nums[i]<0){
            n=st;
            p=i;
        }
        int temp = nums[i];
        nums[i] = nums[st];
        nums[st] = temp;
    }
    private static int setPositive(int[] nums,int st){
        for(int i=st; i<nums.length; i++){
            if(nums[i]>0){
                return i;
            }
        }
        return -1;
    }

    private static int setNegative(int[] nums,int st){
        for(int i=st; i<nums.length; i++){
            if(nums[i]<0){
                return i;
            }
        }
        return -1;
    }
    
}

