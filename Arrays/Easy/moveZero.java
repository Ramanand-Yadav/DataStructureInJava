package Arrays.Easy;

public class moveZero {
    public static void main(String[] args) {
        int[] arr ={0,1,3,0,6,12};
        solution(arr);
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
    private static void solution(int[] arr){
        int i=0;int j=0;int n=arr.length;
        while(j<n){
            while(j<n && arr[j]==0) j++;
            if(j==n){
                break;
            }else if(arr[i]!=0 && arr[j]!=0){
                i++;j++;
            }else{
                arr[i]=arr[j];
                arr[j]=0;
                j++;i++;
            }
        }
    }
    
}
