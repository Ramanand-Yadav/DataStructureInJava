package LeetCode.weekly381;

public class ques01 {
    public static void main(String[] args) {
        
    }
    public static int minimumPushes(String word) {
        int n = word.length();
        if(n<=8)return n;
        else if(n<=16) return (8+(n-8)*2);
        else if(n<=24) return (8+8*2+(n-16)*3);
        else if(n<=26) return (8+8*2+8*3+(n-24)*4);
        return -1;
    }
}
