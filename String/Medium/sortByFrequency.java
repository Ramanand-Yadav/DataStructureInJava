// public class sortByFrequency {
//     public static void main(String[] args) {
//         String s = "tree";
//         String ans = frequencySort(s);
//         System.out.println(s+" : "+ans);
//     }
//     public static String frequencySort(String s) {
//         int[] arr = new int[26];
//         for(char ch : s.toCharArray()){
//             arr[ch-'a']++;
//         }
//         // Arrays.sort(arr);
//         String str = "";
//         for(int i=0; i<26; i++){
//             for(int j=0; j<arr[i]; j++){
//                 str+=(char)(i+'a');
//             }
//         }
//         return str;
//     }
// }
