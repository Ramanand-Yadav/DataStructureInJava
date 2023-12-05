package SlidingWindowTwoPointer.MediumProblems;

public class maxFruits {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3};
        System.out.println(findMaxFruits(arr, arr.length));
    }
    public static int findMaxFruits(int []arr, int n) {
        // Write your code here.
        if(n==0||n==1||n==2)return n;
        int ans1 = 0;
        int ans2 = 0; 
        int i=0; int j=1;
        while(i<n && j<n){
            if(arr[j]==arr[j-1]){
                j++;
            }else{
                if((j-i)>=ans1){
                    ans2 = ans1;
                    ans1 = j-i;
                }else if((j-i)>ans2){
                    ans2 = j-i;
                }
                while(i<=j && arr[i]!=arr[j]){
                    i++;
                }
                j++;
            }
        }
        return ans1+ans2;
    }
}
