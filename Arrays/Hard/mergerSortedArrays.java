package Arrays.Hard;
import java.util.*;

public class mergerSortedArrays {
    public static void main(String[] args) {
        
    }
}
class Solution {
    public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b){
        // Write your code here.
        int i=0;

        while(i<a.length)

        {

            if(a[i] > b[0])

            {

                long temp = a[i];

                a[i] = b[0];

                b[0] = temp;

                i++;

                Arrays.sort(b);

            }

 

            else 

                i++;

        }
    }
}
class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int idx = nums1.length-1;
        
        while(i>=0 && j>=0){
            if(nums1[i]> nums2[j]){
                nums1[idx] = nums1[i];
                i--;
            }
            else{
                nums1[idx] = nums2[j];
                j--;
            }
            idx--;
        }
        //if elements are remaining in one array, fill them
        while(i>=0){
            nums1[idx] = nums1[i];
            i--;
            idx--;
        }
        while(j>=0){
            nums1[idx] = nums2[j];
            j--;
            idx--;
        }
    }
}
