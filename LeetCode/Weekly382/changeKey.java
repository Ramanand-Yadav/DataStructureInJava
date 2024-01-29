package LeetCode.Weekly382;

public class changeKey {
    public static void main(String[] args) {
        
    }
    public static int countKeyChanges(String s) {
        String str = s.toLowerCase();
        int cnt = 0; 
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i)!=str.charAt(i+1)){
                cnt++;
            }
        }
        return cnt; 
    }
}
