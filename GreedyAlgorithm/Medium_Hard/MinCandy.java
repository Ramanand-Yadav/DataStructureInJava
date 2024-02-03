package GreedyAlgorithm.Medium_Hard;

import java.util.*;

public class MinCandy {
    static class Pair{
        int rate;
        int ind;
        Pair(int rate, int ind){
            this.rate = rate;
            this.ind = ind;
        }
    }
    public static void main(String[] args) {
        
    }
    public static int candy(int[] ratings) {
        if(ratings.length==1)return 1;
        Pair[] arr = new Pair[ratings.length];
        for(int i=0; i<ratings.length; i++){
            arr[i] = new Pair(ratings[i],i);
        }
        Arrays.sort(arr, (a,b)->(a.rate-b.rate));
        int cnt = 0;
        int[] candy = new int[ratings.length];
        Arrays.fill(candy,-1);
        for(int i=0; i<arr.length; i++){
            int ind = arr[i].ind;
            int rating = arr[i].rate;
            if(ind==0){
                if(ratings[ind+1]>=rating){
                    candy[ind]=1;
                }else{
                    candy[ind] = candy[ind+1]+1;
                }
            }else if(ind==arr.length-1){
                if(ratings[ind-1]>=rating){
                    candy[ind]=1;
                }else{
                    candy[ind]=candy[ind-1]+1;
                }
            }else{
                int left = ratings[ind-1];
                int right = ratings[ind+1];
                if(rating>left && rating>right){
                    candy[ind]=Math.max(candy[ind-1],candy[ind+1])+1;
                }else if(rating>left){
                    candy[ind]=candy[ind-1]+1;
                }else if(rating>right){
                    candy[ind]=candy[ind+1]+1;
                }else{
                    candy[ind]=1;
                }
                
            }
            cnt+=candy[ind];
        }
        // for(int i=0; i<ratings.length; i++){
        //     System.out.print(ratings[i]+":"+candy[i]+" ");
        // }
        return cnt;
    }
}
