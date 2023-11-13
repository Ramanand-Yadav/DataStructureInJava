package BitManipulation.interviewProblem;

public class singleNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2};
        int n = 5;
        System.out.println(missingNumber(n, arr));
    }
    public static int missingNumber(int n, int []arr){
        // Write your code here.
        int cnt=arr[0];
        for(int i=1; i<arr.length; i++){
            cnt ^= arr[i];
        }
        return cnt;
    }
}
