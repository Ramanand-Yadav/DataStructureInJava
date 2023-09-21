package Arrays.Medium;
public class maxSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4};
        Kadane(arr);
    }

    private static int Kadane(int[] arr){
        int sum=0; int maxSum=0;
        for(int i=0; i<arr.length; i++){
            sum+=0;
            if(sum>maxSum) maxSum=sum;
            if(sum<0) sum=0;
        }
        return maxSum;
    }
    
}
