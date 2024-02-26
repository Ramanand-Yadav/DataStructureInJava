package LeetCode.Weekly386;

import java.util.Arrays;

public class EarlistMarkedQ3 {
    public static void main(String[] args) {
        int[] nums = {2,2,0};int[] changeIndices = {2,2,2,2,3,2,2,1};
        int time = earliestSecondToMarkIndices(nums, changeIndices);
        System.out.println(time);
    }
    public static int earliestSecondToMarkIndices(int[] nums, int[] changeIndices) {
        // int n = nums.length;
        int[] changeIndicesAdjusted = Arrays.stream(changeIndices).map(index -> index - 1).toArray();
        print(changeIndices);
        print(changeIndicesAdjusted);
        int low = 0, high = changeIndices.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (isPossible(nums, changeIndicesAdjusted, mid)) high = mid;
            else low = mid + 1;
        }
        return isPossible(nums, changeIndicesAdjusted, low) ? low + 1 : -1;
    }

    private static boolean isPossible(int[] nums, int[] changeIndices, int s) {
        int n = nums.length;
        int[] last = new int[n];
        Arrays.fill(last, -1);
        for (int i = 0; i <= s; i++) {
            last[changeIndices[i]] = i;
        }
        int marked = 0, operations = 0;
        for (int i = 0; i <= s; i++) {
            if (i == last[changeIndices[i]]) {
                if (nums[changeIndices[i]] > operations) return false;
                operations -= nums[changeIndices[i]];
                marked++;
            } else {
                operations++;
            }
        }
        return marked == n;
    }
    private static void print(int[] arr){
        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
