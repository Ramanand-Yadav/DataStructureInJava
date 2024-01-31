package GreedyAlgorithm.Medium_Hard;
public class jumpGame2 {
    public static void main(String[] args) {
        
    }
    public static int minJumps(int []arr, int n) {
        // Write your code here.
        if(n==1)return 0;
        int jump=0;
        int currReach = 0;
        int currMax = 0;
        boolean flag=false;
        
        for(int i=0; i<arr.length-1; i++){
            if(i+arr[i]>currMax)currMax=i+arr[i];
            if(i==currReach){
                jump++;
                currReach=currMax;
            }
            if(currMax>=n-1)flag=true;
        }
        if(flag==false)return -1;
        return jump;
    }
}
