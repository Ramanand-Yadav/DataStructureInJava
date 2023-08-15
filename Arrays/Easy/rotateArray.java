package Arrays.Easy;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotateArray x = new rotateArray();
        Solution m = x.new Solution();
        m.rotate(arr,k);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    class Solution {
        public void rotate(int[] nums, int k) {
            k = k%nums.length; 
            if(k==nums.length) return;
            int n = nums.length; 
            int i=0,j=n-1;
            while(i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            } 
            i=0;j=k-1;
            while(i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            i=k;j=n-1;
            while(i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
    }
    
}
