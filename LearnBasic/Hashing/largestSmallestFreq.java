package LearnBasic.Hashing;

import java.util.HashMap;
import java.util.Map;

public class largestSmallestFreq {
    public static void main(String[] args){
        int[] arr = getFrequencies(new int[]{1,2,3,1,1,4});
        System.out.println(arr[0]+" "+arr[1]);
    }
    public static int[] getFrequencies(int []v) {
        // Write Your Code Here
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<v.length; i++){
            mp.put(v[i],mp.getOrDefault(v[i], 0)+1);
        }
        int maxValue = Integer.MIN_VALUE;
        int mxFeq = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int mnFeq = Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            int val = entry.getValue();
            int key = entry.getKey();
            if(val>mxFeq){
                maxValue = key;
                mxFeq = val;
            }else if(val==mxFeq){
                if(maxValue>key){
                    maxValue = key;
                }
            }

            if(val<mnFeq){
                minValue = key;
                mnFeq = val;
            }else if(val==mnFeq){
                if(minValue>key){
                    minValue = key;
                }
            }
        }
        int[] arr ={maxValue,minValue};
        return arr;
    }
    
}
