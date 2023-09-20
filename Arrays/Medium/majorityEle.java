package Arrays.Medium;
public class majorityEle {
    public static void main(String[] args) {
        int[] arr = {3,2,3};

        System.out.println(solve(arr));
    }
    private static int solve(int[] arr){
        int ele=0,cnt=0;
        for(int i=0; i<arr.length; i++){
            if(cnt==0){
                ele=arr[i];
                cnt=1;
            }else if(ele==arr[i]){
                cnt++;
            }else{
                cnt--;
            }
        }
        return ele;
    }
    
}
