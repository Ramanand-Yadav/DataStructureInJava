public class longestPailendrome {
    public static void main(String[] args) {
        String s = "aabaac";
        String str = longestPalindrome(s);
        System.out.println("Longest Palendrome string : "+str);
    }
    public static String longestPalindrome(String s){
        int[] arr = new int[2]; 
        int n = s.length();
        for(int i=0; i<n-1; i++){
            checkPailendrome(s, i, i, arr);
            checkPailendrome(s, i, i+1, arr);
        }
        return s.substring(arr[0], arr[0]+arr[1]);
    }
    private static void checkPailendrome(String s, int i, int j, int[] arr){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            if((j-i+1)>arr[1]){
                arr[1] = j-i+1;
                arr[0] = i;
            }
            i--;
            j++;
        }
    }
    public static String longestPalindrome1(String s) {
        int ans = 0;
        String str = "";
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                int st = i; 
                int end = j;
                // System.out.println("substring : "+s.substring(i, j));
                
                while(st<=end){
                    if(s.charAt(end)!=s.charAt(st)){
                        break;
                    }
                    st++;
                    end--;
                }
                if(st>end && ans<(j-i+1)){
                    ans = j-i+1;
                    str = s.substring(i, j+1);
                }
            }
        }
        return str;
    }
}
