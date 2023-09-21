package BinarySearch.BSONAnswer;
// import java.util.ArrayList;

public class painterPartition {
    public static void main(String[] args) {
        
    }
}
/* 
class Solution 
{
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        int l = Integer.MIN_VALUE;
        int r = 0;
        for(int i : boards){
            l = Math.max(l, i);
            r+=i;
        }

        while(l<=r){
            int mid = (l+r)/2;
            int cntlabour = cntLabour(boards,mid);
            if(cntlabour<=k){
                r=mid-1;
            }else{
                l = mid+1;
            }
        }
        return l;
    }
    private static int cntLabour(ArrayList<Integer> arr, int val){
        int cnt = 1;
        int sum = 0;
        for(int i=0;i<arr.size(); i++){
            if(sum+arr.get(i)<=val){
                sum+=arr.get(i);
            }else{
                sum = arr.get(i);
                cnt++;
            }
        }
        return cnt;
    }
}
*/
