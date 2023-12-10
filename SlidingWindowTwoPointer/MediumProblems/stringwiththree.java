package SlidingWindowTwoPointer.MediumProblems;

public class stringwiththree {
    public static void main(String[] args) {
        String str = "abcabc";
        System.out.println(numberOfSubstrings(str));
    }
    public static int numberOfSubstrings(String s) {
        int cnt = 0; 
        int a=-1,b=-1,c=-1; 
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a')a=i;
            else if(s.charAt(i)=='b')b=i; 
            else c=i;
            if(i>1)cnt += Math.min(Math.min(a,b),c)+1;
        }
        return cnt; 
    }
}
