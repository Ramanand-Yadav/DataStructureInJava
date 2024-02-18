package LeetCode.BiWeekly124;

public class Que1maximumScore {
    public static void main(String[] args) {
        int[] nums = {3,2,1,4,5};
        System.out.println(maxOperations(nums));
    }
    public static int maxOperations(int[] nums) {
        int score = nums[0]+nums[1];
        int size = nums.length;
        if(size==2)return 1;
        int cnt = 1;
        for(int i=2; i<size-1; i+=2){
            if((nums[i]+nums[i+1])==score)cnt++;
            else break;
        }
        return cnt;
    }
}
