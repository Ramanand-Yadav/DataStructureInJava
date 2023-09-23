
public class countNumberSubString {
    public static void main(String[] args) {
        String str = "aacfssa";
        int k = 3;
        int ans = countSubStrings(str, k);
        System.out.println("Total number of substring with k different char : "+ans);
    }
    public static int countSubStrings(String str, int k) {
        int ans = 0;
        for(int i=0; i<str.length(); i++){
            int cnt = 0;
            int[] arr = new int[26];
            for(int j=i; j<str.length(); j++){
                int ind = str.charAt(j)-'a';
                if(arr[ind]==0){
                    arr[ind]++;
                    cnt++;
                }
                if(cnt==k) ans++;
                if(cnt>k) break;
            }
        }
        return ans;
    }
    /* 
    public static int countSubStrings(String str, int k) {
        // Write your code here.
        int cnt = 0;
        for(int i=0; i<str.length(); i++){
            Set<Character> set = new HashSet<>();
            set.add(str.charAt(i));
            for(int j=i+1; j<str.length(); j++){
                set.add(str.charAt(j));
                if(set.size()==k)cnt++;
            }
            
        }
        return cnt;
    }
    */
}
