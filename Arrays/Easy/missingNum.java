package Arrays.Easy;

public class missingNum {
    public static void main(String[] args) {
        
    }
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2;
        // int val=0;
        // System.out.println(sum);
        for(int i=0; i<n; i++){
            sum-=nums[i];
        }
        return sum;
    }
    
}
