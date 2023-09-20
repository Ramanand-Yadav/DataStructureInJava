package Arrays.Medium;
import java.util.*;
import java.util.Arrays;

public class nextPermutation {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        int[] arr2 = sovle(arr);
        for(int val : arr2){
            System.out.print(val+" ");
        }
    }
    private static int[] sovle(int[] arr){
        int ind = -1;
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                ind = i; 
                break;
            }
        }
        if(ind==-1){
            return reverse(arr);
        }
        for(int i=arr.length-1; i>ind; i--){
            if(arr[i]>arr[ind]){
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
                break;
            }
        }
        int st = ind+1;
        int end = arr.length-1;
        while(st<end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            end--;
            st++;
        }
        return arr;
    }

    private static int[] reverseInNewArray(int[] arr){
        int[] ans = new int[arr.length];
        int j=0;
        for(int i=arr.length-1; i>=0; i--){
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }
    private static int[] reverse(int[] arr){
        int st=0,end=arr.length-1;
        while(st<end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            end--;
            st++;
        }
        return arr;
    }
}
