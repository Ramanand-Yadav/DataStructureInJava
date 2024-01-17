package Heaps.medium;

import java.util.*;

public class kconsecutionarr {
    public static void main(String[] args) {
        
    }
    public static boolean isNStraightHand(int[] hand, int w) {
        if(hand.length%w!=0)return false;
        Map<Integer,Integer>mp = new HashMap<>();
        for(int i=0; i<hand.length; i++){
            if(mp.containsKey(hand[i])){
                mp.replace(hand[i], mp.get(hand[i])+1);
            }else{
                mp.put(hand[i],1);
            }
        }
        while(mp.size()>0){
            int minVal = mp.get(3);
            for(int i=minVal; i<minVal+w; i++){
                if(!mp.containsKey(i))return false;
                int cnt = mp.get(i);
                if(cnt==1)mp.remove(i);
                else mp.replace(i, cnt-1);
            }
        }
        return true;
    }
}
