package LeetCode.weekly381;
import java.util.*;
public class quest03 {
    static class pair{
        char ch;
        int val;
        pair(char ch, int val){
            this.ch = ch;
            this.val = val;
        }
    }
    public static void main(String[] args) {
        String word = "aabbccddeeffgghhiiiiii";
        System.out.println(minimumPushes(word));
    }
    public static int minimumPushes(String word) {
        Map<Character,Integer>mp = new HashMap<>();
        for(char ch : word.toCharArray()){
            if(mp.containsKey(ch))mp.replace(ch, mp.get(ch)+1);
            else mp.put(ch,1);
        }
        PriorityQueue<pair>pq = new PriorityQueue<>((a,b)->b.val-a.val);
        for(char ch : mp.keySet()){
            pair p = new pair(ch,mp.get(ch));
            pq.add(p);
        }
        int cnt = 1;
        int ans = 0;
        //sort on the basis of value first 8 ke liye 1
        while(!pq.isEmpty()){
            if(cnt<=8){
                ans+=pq.remove().val*1;
                cnt++;
            }else if(cnt<=16){
                ans+=pq.remove().val*2;
                cnt++;
            }else if(cnt<=24){
                ans+=pq.remove().val*3;
                cnt++;
            }else if(cnt<=26){
                ans+=pq.remove().val*4;
            }
        }
        return ans;
        // second  8 ke liye 2

        // third 8 ke liye 3

        // last 2 ke liye 4
    }
}
