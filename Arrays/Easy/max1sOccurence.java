package Arrays.Easy;
public class max1sOccurence {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,0,1,1,1,0,0,1,1,1,1}));
    }
    private static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int freq = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                max++;
            }else{
                max = 0;
            }
            freq = Math.max(freq, max);
        }
        return freq;
    }
    
}
