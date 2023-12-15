package SlidingWindowTwoPointer.HardProblems;

import java.util.HashMap;

public class minSubstringWithMatch {
    public static void main(String[] args) {
        String s = "abcdebdde", t = "bde";
        System.out.println(minWindow(s, t));
        System.out.println(minWindow1(s, t));
    }
    public static String minWindow(String s, String t) {
        if(s=="" || t=="")
            return "";
        if(s==null || t==null)
            return "";
        String ans = "";
        HashMap<Character, Integer>mpt = new HashMap<>();
        HashMap<Character, Integer>mps = new HashMap<>();
        for(int k=0; k<t.length(); k++){
            mpt.put(t.charAt(k), mpt.getOrDefault(t.charAt(k), 0)+1);
        }
        int i=-1,j=-1,mct=0,dmct=t.length();
        while(true){
            //acuire
            boolean f1=false,f2=false;
            while(i<s.length()-1 && mct<dmct){
                i++; 
                char ch = s.charAt(i);
                mps.put(ch, mps.getOrDefault(ch, 0)+1);

                if(mps.getOrDefault(ch, 0)<=mpt.getOrDefault(ch, 0)){
                    mct++; 
                }
                f1=true;
            }
            //collect and release
            while(j<i && mct==dmct){
                String pans = s.substring(j+1,i+1);
                if(ans.length()==0 || pans.length()<ans.length())ans=pans;
                j++;
                char ch = s.charAt(j);
                if(mps.get(ch)==1)mps.remove(ch);
                else mps.put(ch, mps.get(ch)-1);

                if(mps.getOrDefault(ch, 0)<mpt.getOrDefault(ch, 0)){
                    mct--; 
                }
                f2=true;
            }
            if(f1==false && f2==false)break;
        }
        return ans;
    }
    public static String minWindow1(String s, String t) {
        
        
        if(s=="" || t=="")
            return "";
        if(s==null || t==null)
            return "";
        
        int n = s.length();
        int m = t.length();
        
        
        int freq[] = new int[128];
        int characters = 0;
        
        for(int i=0;i<m;i++){
            freq[t.charAt(i)]++;
            characters++;
        }
        
        int start =0, end = 0;
        int min_length = Integer.MAX_VALUE;
        int start_index = 0;
        
        while(end < n){
            
            if(freq[s.charAt(end)]>0)
                characters--;
            freq[s.charAt(end)]--;
            end++;
            
            while(characters==0){
                
                if(min_length>end-start){
                    min_length = end-start;
                    start_index = start;
                }
                freq[s.charAt(start)]++;
                if(freq[s.charAt(start)]>0){
                    characters++;
                }
                start++;
                
            }
            
        }
        
        return min_length == Integer.MAX_VALUE? "" : s.substring(start_index,start_index+min_length);
        
    }
}
