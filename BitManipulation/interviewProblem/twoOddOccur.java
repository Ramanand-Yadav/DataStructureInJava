package BitManipulation.interviewProblem;

public class twoOddOccur {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7,8, 3, 9, 4, 5, 6, 7, 8};
        int[] ans = twoOddNum(arr);
        for(int val : ans){
            System.out.println(val);
        }
        // System.out.println(ans);
    }
    public static int[] twoOddNum(int []arr){
        // Write your code here.
        int x = 0; int y=0; 
        int xor = arr[0];
        for(int i=1; i<arr.length; i++){
            xor ^= arr[i];
        }
        int rmsb = xor& (~(xor-1));
        // System.out.println(rmsb);
        for(int i=0; i<arr.length; i++){
            int sign = rmsb & arr[i];
            if(sign>0){
                x ^= arr[i];
            }else{
                y ^= arr[i];
            }
        }
        int[] ans = new int[2];
        if(x>y){
            ans[0]=x;
            ans[1]=y;
        }else{
            ans[0]=y;
            ans[1]=x;
        }
        return ans;
    }
}
