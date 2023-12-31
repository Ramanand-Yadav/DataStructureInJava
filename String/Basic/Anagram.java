package String.Basic;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        
    }
    public static boolean isAnagram(String s, String t) {
        //Your code goes here
        if(s.length()!=t.length()) return false;
        int[] arr = new int[26]; 
        Arrays.fill(arr, 0); 
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int i=0; i<26; i++){
            if(arr[i]!=0) return false;
        }
        return true;
    }
}
