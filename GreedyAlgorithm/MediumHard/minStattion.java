package GreedyAlgorithm.MediumHard;

import java.util.Arrays;

public class minStattion {
    public static void main(String[] args) {
        
    }
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        // Write your code here.
        if(n==0)return 0;
        int station = 1;int res=1;
        Arrays.sort(at);
        Arrays.sort(dt);
        int i=1; int j=0; 
        while(i<n && j<n){
            if(at[i]<=dt[j]){
                station++;
                i++;
            }else if(at[i]>dt[j]){
                station--;
                j++;
            }
            if(station>res)res=station;
        }
        return res;
    }

}
