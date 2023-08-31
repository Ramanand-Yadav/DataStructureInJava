package Arrays.Hard;

public class maxproductSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, -4, 6, -8, 3, 0, 1};
        System.out.println(maxProduct(arr));
    }

    private static int maxProduct(int[] nums) {
        // int sum =0;
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        // for(int i=0; i<n; i++){
        //     int cal = 1;
        //     for(int j=i;j<n;j++){
        //         cal*=nums[j];
        //         if(sum<cal) sum=cal;
        //     }
        // }
        int pre = 1;
        int suf = 1;
        int sum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(pre==0) pre = 1;
            if(suf==0) suf = 1;

            pre*=nums[i];
            suf*=nums[n-i-1];
            sum = Math.max(sum, Math.max(pre, suf));
        }
        return sum;
    }
}
