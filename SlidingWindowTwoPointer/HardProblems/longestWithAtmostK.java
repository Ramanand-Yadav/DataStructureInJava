package SlidingWindowTwoPointer.HardProblems;

import java.util.HashMap;
import java.util.Map;

public class longestWithAtmostK {
    public static void main(String[] args) {
        String str = "stttrcsssssssc";
        int k = 2;
        System.out.println(kDistinctChars(k, str));
    }
    public static int kDistinctChars(int k, String str) {
        Map<Character,Integer> map=new HashMap<>();
        int i=0,j=0,ans=-1;
        while(j<str.length()){
            char ch=str.charAt(j);
            if(map.containsKey(ch)){
				map.put(ch,map.get(ch)+1);
			}else{
                map.put(ch,1);
            }
            if(map.size()==k){
                ans=Math.max(ans, j-i+1);
                j++;
            }
            else if(map.size()<k){
                j++;
            }else if(map.size()>k){
            while(map.size()>k){
                char c2=str.charAt(i);
                map.put(c2, map.get(c2)-1);
                if(map.get(c2)==0){
                    map.remove(c2);
                }
                i++;
            }
            j++;
            }
        }
        if(ans==-1) return str.length();
        return ans;
    }
}
