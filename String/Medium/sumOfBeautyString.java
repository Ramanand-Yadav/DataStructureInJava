import java.util.*;

public class sumOfBeautyString {
    public static void main(String[] args) {
        String s = "aabcbaa";
        int ans = beautySum(s);
        System.out.println("beauty sum : "+ans);
    }
    public static int beautySum(String s) {
        int ans = 0; 
        for(int i=0; i<s.length(); i++){
            Map<Character, Integer>mp = new HashMap<>(); 
            for(int j=i;j<s.length(); j++){
                char ch = s.charAt(j);
                mp.put(ch, mp.getOrDefault(ch, 0)+1);
                int max = 0;
                int min = Integer.MAX_VALUE;
                for(int val : mp.values()){
                    max = Math.max(max, val);
                    min = Math.min(min, val);
                }
                ans += max-min;
            }
        }
        return ans;
    }
}
