package Heaps.medium;

import java.util.Arrays;

public class taskScheduler {
    public static void main(String[] args){

    }
    public static int leastInterval(char[] tasks, int n) {
       int[] char_map = new int[26];
       for(char c : tasks){
        char_map[c-'A']++;
       }
       Arrays.sort(char_map);
       int max_val = char_map[25]-1;
       int idle_slot = max_val*n;
       for(int i=24; i>=0; i--){
        idle_slot -= Math.min(char_map[i],max_val);
       } 

       return idle_slot>0?idle_slot+tasks.length:tasks.length;
    }
}
