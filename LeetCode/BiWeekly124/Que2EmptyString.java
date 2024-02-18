package LeetCode.BiWeekly124;

import java.util.Arrays;

public class Que2EmptyString {
    public static void main(String[] args) {
        String s = "aabcbbca";
        System.out.println(lastNonEmptyString(s));
    }
    public static String lastNonEmptyString(String s) {
        int[] count = new int[26];
        int max = 0;
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)-'a']++;
            max = Math.max(max, count[s.charAt(i)-'a']);
        }
        // System.out.println(max);
        StringBuilder sb = new StringBuilder();
        count = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            count[ch-'a']++;
            if(count[ch-'a']==max)sb.append(ch);
        }
        return sb.toString();
    }
    public String lastNonEmptyString1(String s) {
        int[][] pair = new int[26][3];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            pair[ch-'a'][0]++;
            pair[ch-'a'][1]=i;
            pair[ch-'a'][2]=ch-'a';
        }
        Arrays.sort(pair,(a,b)->{
            if(a[0]==b[0]){
                return Integer.signum(a[1]-b[1]);
            }else{
                return Integer.signum(b[0]-a[0]);
            }
        });
        StringBuilder sb = new StringBuilder();
        int max=pair[0][0];
        for(int i=0; i<26; i++){
            if(pair[i][0]!=max)break;
            char ch = (char)(pair[i][2]+'a');
            sb.append(ch);
        }
        return sb.toString();
    }
}
