public class reversewords {
    public static void main(String[] args) {
        String s = " a good   example  ";
        String ans = reverseWords(s);
        System.out.println("reverse word : "+ans);
    }
    public static String reverseWords(String s) {
        String ans = "";
        String[] str = s.trim().split("\\s+");
        for(int i=str.length-1; i>0; i--){
            ans += str[i]+" ";
        }
        ans += str[0];
        return ans;
    }
}
