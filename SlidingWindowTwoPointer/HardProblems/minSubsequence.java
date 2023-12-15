package SlidingWindowTwoPointer.HardProblems;

public class minSubsequence {
    public static void main(String[] args) {
        String s = "abcdebdde", t = "bde";
        System.out.println(minWindow1(s, t));
    }
    public static String minWindow(String S, String T) {
        // Write your code here
        int i=0,j=0,k=0; 
        char[] str = S.toCharArray();
        char[] ts = T.toCharArray();
        String ans="";
        int res = Integer.MAX_VALUE;
        while(j<S.length() && k<T.length()){
            if(str[j]==ts[k]){
                k++;
            }
            if(k==T.length()){
                i = j; 
                k = T.length()-1;
                while(i>=0 && k>=0){
                    if(str[i]==ts[k]){
                        k--;
                    }
                    i--;
                }
                i++; 
                if(res>j-i+1){
                    res = j-i+1;
                    ans = S.substring(i,j-i+1);
                }
                k = 0;
                j = i+1;
            }
            j++; 
        }
        return ans;
    }
    public static String minWindow1(String S, String T) {

        int s1=0,s2=0,s1Length=S.length(),s2Length=T.length();
        int start=0,end=0;
        int minLength=Integer.MAX_VALUE;
        String minSubstring="";
        while(s1<s1Length){
            if(S.charAt(s1)==T.charAt(s2)){
                if(s2==s2Length-1) {
                    end=s1;
                    while (s2 >= 0) {
                        if (S.charAt(s1) == T.charAt(s2)) {
                            s2--;
                        }
                        s1--;
                    }
                    start=s1+1;
                    if ((end - start + 1) < minLength) {
                        minSubstring = S.substring(start, end + 1);
                        minLength = minSubstring.length();
                    }
                    s1=s1+1;
                    s2=0;
                }
                else s2++;
            }
            s1++;
        }
        return minSubstring;
    }
}
