package LeetCode.Biweekly122;

public class Question1 {
    public static void main(String[] args) {
        
    }
    /* 
    public static int countPrefixSuffixPairs(String[] words) {
        int cnt = 0; 
        int len = words.length; 
        if(len==1)return 0;
        // System.out.println(len);
        for(int i=0; i<len-1; i++){
            // System.out.println(i);
            String word = words[i];
            
            for(int j=i+1; j<len; j++){
                String com = words[j];
                int size = com.length();
                int size2 = word.length();
                // System.out.println(word.length()+" "+size);
                if(size>=size2){
                    String pre = com.substring(0,size2);
                    String suf = com.substring(size-size2);
                    // System.out.println(pre+" "+suf+" word:"+word+" com:"+com);
                    if(pre.equals(word) && suf.equals(word))cnt++;
                }
            } 
        }
        return cnt;
    }
    public static int minimumCost(int[] nums) {
        int minSum = Integer.MAX_VALUE;
        int n =nums.length;
        for(int i=0; i<n-2; i++){
            int sum = nums[0]+nums[i+1];
            for(int j=i+1; j<n-1; j++){
                sum+=nums[j+1];
                // System.out.println(nums[0]+"+"+nums[i+1]+"+"+nums[j+1]+"="+sum);
                minSum = Math.min(minSum, sum);
                sum-=nums[j+1];
            }
        }
        return minSum;
    }
    */
}
