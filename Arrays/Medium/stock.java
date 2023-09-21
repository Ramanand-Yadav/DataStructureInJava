package Arrays.Medium;
public class stock {
    public static void main(String[] args) {
        int[] arr = {1, 2,3};
        stockBuySell(arr);
    }
    private static int stockBuySell(int[]arr){
        int ans=0;int mp=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<mp) mp = arr[i];
            if(arr[i]-mp>ans) ans = arr[i]-mp;
        }
        return ans;
    }
}
