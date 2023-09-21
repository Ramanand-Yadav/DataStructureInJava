package String.Basic;

import java.util.Arrays;

public class commonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx=0;
        while(idx<s1.length() && idx<s2.length() && s1.charAt(idx)==s2.charAt(idx)){
            idx++;
        }
        if(idx==0) return "-1";
        return s1.substring(0,idx);
    }
}