package SlidingWindowTwoPointer.MediumProblems;

import java.util.*;

public class longestSubwithoutRep {
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(lengthOfLongestSubstring(str));
    }
    public static int lengthOfLongestSubstring(String s) {
        int i=0; int j=0; 
        Set<Character>set = new HashSet<>();
        int ans = 0;
        int n = s.length();
        while(i<n && j<n){
            char jth = s.charAt(j);
            if(set.contains(jth)){
                while(i<j && s.charAt(i)!=jth){
                    set.remove(s.charAt(i));
                    i++;
                }
                set.remove(s.charAt(i));
                i++;
            }
            set.add(jth);
            ans = Math.max(ans, set.size());
            j++;
        }
        return ans;
    }
    public static int lengthOfLongestSubstring1(String s) {
        if(s.length() == 1 || s.length()==0){
            return s.length();
        }
        char[] str = s.toCharArray();
        int st=0;
        int ans=0;
        var map = new HashMap<Character, Integer>();
        for(int j=0; j<str.length; j++){
            char ch = str[j];
            boolean flag = map.containsKey(ch);
            if(flag == true){
                ans = Math.max(ans, (j-st));
                int val = map.get(ch);
                for(int i=st; i<=val; i++){
                    map.remove(str[i]);
                }
                st = val + 1;
            }
            map.put(ch, j);
        }
        ans = Math.max(ans, s.length()-st);
        return ans;
    }
}
