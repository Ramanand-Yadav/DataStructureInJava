package SlidingWindowTwoPointer.MediumProblems;

public class maxsumfromStEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 1};
        int k = 7;
        System.out.println(maxScore(arr,k));
    }
    public static int maxScore(int[] cardPoints, int k) {
        long totalSum = 0;
        for(int i=0; i<cardPoints.length; i++){
            totalSum+=cardPoints[i];
        }

        long sumSub = 0;
        int j=0; 
        while(j<cardPoints.length-k){
            sumSub+=cardPoints[j];
            j++;
        }
        int i = 0;
        long ans = 0; 
        while(j<cardPoints.length){
            ans = Math.max(ans, totalSum-sumSub);
            sumSub-=cardPoints[i];
            i++; 
            sumSub+=cardPoints[j];
            j++; 
        }
        ans = Math.max(ans, totalSum-sumSub);
        return (int)ans;
    }
}
