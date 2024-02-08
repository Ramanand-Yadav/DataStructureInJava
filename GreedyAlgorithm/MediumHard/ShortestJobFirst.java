package GreedyAlgorithm.MediumHard;

import java.util.Arrays;
import java.util.Comparator;

public class ShortestJobFirst {
    static class Pair{
        int arrivalTime;
        int burstTime;
        Pair(int arrivalTime, int burstTime){
            this.arrivalTime=arrivalTime;
            this.burstTime=burstTime;
        }
    }
    public static void main(String[] args) {
        int[] arrivalTime = {12,29,25,22,4,24,29,10,11};
        int[] burstTime = {26,11,14,3,21,6,28,29,7};
        System.out.println(sjf(9, arrivalTime, burstTime));
    }
    public static float sjf(int n, int []arrivalTime, int []burstTime)
    {
        // Write your code here.
        Pair[] arr = new Pair[arrivalTime.length];
        for(int i=0; i<arrivalTime.length;i++){
            arr[i] = new Pair(arrivalTime[i], burstTime[i]);
        }
        Arrays.sort(arr, new Comparator<Pair>() {
            public int compare(Pair a, Pair b){
                if(a.arrivalTime>b.arrivalTime)return 1;
                else if(a.arrivalTime<b.arrivalTime)return -1;
                else{
                    if(a.burstTime>b.burstTime)return 1;
                    else if(a.burstTime<b.burstTime)return -1;
                    else return 0;
                }
            }
        });
        int time=arr[0].arrivalTime; 
        int[] waitTime=new int[arr.length];
        waitTime[0]=0;
        for(int i=1; i<arr.length; i++){
            time += arr[i-1].burstTime;
            waitTime[i]=time-arr[i].arrivalTime;
        }
        float val=0;
        for(int val1 : waitTime){
            val+=val1;
        }
        for(int i=0; i<arrivalTime.length; i++){
            System.out.println(arr[i].arrivalTime+" "+arr[i].burstTime+" "+waitTime[i]);
        }
        return val/arr.length;
    }
}
