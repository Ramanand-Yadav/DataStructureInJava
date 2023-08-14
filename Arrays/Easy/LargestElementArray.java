package Arrays.Easy;

public class LargestElementArray {
    public static void main(String[] args) {
        System.out.println(largestElement(new int[]{6,2,1,9,2,1},6));
    }
    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int ans = arr[0];
        for(int i: arr){
            if(i>ans){
                ans = i;
            }
        }
        return ans;

    }
    
}
