package BinarySearch.BSONAnswer;

public class findNthRootM {
    public static void main(String[] args) {
        
    }
}
class Solution {
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int l = 1; int r = m;
        // for(int i=1; i<=m; i++){
        //     int val = cal(i,n);
        //     if(val==m) return i;
        //     if(val>m) break;
        // }
        while(l<=r){
            int mid = (l+r)/2;
            int val = cal(mid, n);
            if(val==m){
                return mid;
            }else if(val>m){
                r = mid-1;
            }else{
                l = mid+1;
            }

        }
        return -1;
    }

    private static int cal(int base, int num){
        return (int) Math.pow(base, num);
    }
}
