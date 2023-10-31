package Recursion.subSequencePattern;

import java.util.*;

public class moreSubsequence {
    public static void main(String[] args){
        // cbfbdhcac
        // bcbcfbeag 
        String a = "cbfbdhcac";
        String b = "bcbcfbeag";
        int n = 9; int m = 9; 
        System.out.println(moreSubsequence1(n, m, a, b));
        System.out.println(moreSubsequence2(n, m, a, b));
    }
    public static String moreSubsequence1(int n, int m, String a, String b) {
        // Write your code here
        Set<String>set1 = new HashSet<>();
        Set<String>set2 = new HashSet<>();
        for(int i=0; i<(1<<n); i++){
            String temp = "";
            for(int j=0; j<n; j++){
                if((i&(1<<j))!=0){
                    temp += a.charAt(j);
                }
            }
            set1.add(temp);
        }
        for(int i=0; i<(1<<m); i++){
            String temp = "";
            for(int j=0; j<m; j++){
                if((i&(1<<j))!=0){
                    temp += b.charAt(j);
                }
            }
            set2.add(temp);
        }
        return set1.size()>set2.size() ? a:b;
    }
    public static String moreSubsequence2(int n, int m, String a, String b){
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for(int i=0; i<n; i++){
            set1.add(a.charAt(i));
        }
        for(int i=0; i<m; i++){
            set2.add(b.charAt(i));
        }
        System.out.println(set1.size()+" "+set2.size());
        if(set1.size()>set2.size()) return a;
        else if(set1.size()==set2.size()){
            if(n>=m){
                return a;
            }else{
                return b;
            }
        }else return b;
    }
}
