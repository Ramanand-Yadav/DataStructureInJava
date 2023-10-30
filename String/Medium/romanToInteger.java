// import java.util.HashMap;
// import java.util.Map;

// public class romanToInteger{
//     public static void main(String[] args) {
//         String s = "XVII";
//         int num = romanToInt1(s);
//         System.out.println("Integer number is : "+num);
//     }
//     public static int romanToInt1(String s) {
//         Map<Character, Integer> mp = new HashMap<>();
//         mp.put('I', 1); mp.put('V',5); mp.put('X', 10); mp.put('L', 50);
//         mp.put('C', 100); mp.put('D', 500); mp.put('M', 1000);
//         if(s.length()==1) return mp.get(s.charAt(0));
//         int ans = 0;
//         for(int i=0; i<s.length()-1; i++){
//             if(mp.get(s.charAt(i))<mp.get(s.charAt(i+1))){
//                 ans = ans - mp.get(s.charAt(i));
//             }else{
//                 ans = ans + mp.get(s.charAt(i));
//             }
//         }
//         ans += mp.get(s.charAt(s.length()-1));
//         return ans;
//     }
// }