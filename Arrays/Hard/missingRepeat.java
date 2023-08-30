package Arrays.Hard;
import java.util.*;

public class missingRepeat {
    public static void main(String[] args) {
        
    }
}
class Solution {
    public static int[] findMissingRepeatingNumbers(int []a) {
        // Write your code here
        // int n = a.length; // size of the array
        // int repeating = -1, missing = -1;

        //Find the repeating and missing number:
        // for (int i = 1; i <= n; i++) {
        //     //Count the occurrences:
        //     int cnt = 0;
        //     for (int j = 0; j < n; j++) {
        //         if (a[j] == i) cnt++;
        //     }

        //     if (cnt == 2) repeating = i;
        //     else if (cnt == 0) missing = i;

        //     if (repeating != -1 && missing != -1)
        //         break;
        // }
        // int[] ans = {repeating, missing};
        // return ans;
        /*
        long sn = (n*(n+1))/2;
        long s2n = (n*(n+1)*(2*n+1))/6;

        int s = 0,s2=0;
        for(int i=0; i<a.length;i++){
            s += a[i];
            s2 += (long)a[i]*(long)a[i];
        }

        long val1 = s-sn;
        long val2 = s2-s2n;
        val2 = val2/val1;

        long x = (val1+val2)/2;
        long y = x-val1;
        int[] ans = {(int)x, (int)y};
        return ans;
        */
        int n = a.length; 
        //size of the array
        int xr = 0;

        //Step 1: Find XOR of all elements:
        for (int i = 0; i < n; i++) {
            xr = xr ^ a[i];
            xr = xr ^ (i + 1);
        }

        //Step 2: Find the differentiating bit number:
        int number = (xr & ~(xr - 1));

        //Step 3: Group the numbers:
        int zero = 0;
        int one = 0;
        for (int i = 0; i < n; i++) {
            //part of 1 group:
            if ((a[i] & number) != 0) {
                one = one ^ a[i];
            }else {
                zero = zero ^ a[i];
            }
        }

        for (int i = 1; i <= n; i++) {
            //part of 1 group:
            if ((i & number) != 0) {
                one = one ^ i;
            }
            //part of 0 group:
            else {
                zero = zero ^ i;
            }
        }

        // Last step: Identify the numbers:
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == zero) cnt++;
        }

        if (cnt == 2) return new int[] {zero, one};
        return new int[] {one, zero};

    }
}
