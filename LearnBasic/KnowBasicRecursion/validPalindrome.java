package LearnBasic.KnowBasicRecursion;

public class validPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
        //done
    }
    private static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        StringBuilder rev = new StringBuilder();
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            char l = s.charAt(i);
            if((l>='a' && l<='z') || (l>='0' && l<='9')){
                str.append(l);
                rev.insert(0,l);
            }
            // System.out.println(l+" "+str.toString());
        }
        // System.out.println(str.toString());
        // StringBuilder rev = new StringBuilder();

        // System.out.println(rev.toString()+" "+str.toString());
        

        if(rev.toString().equals(str.toString())){
            return true;
        }else{
            return false;
        }
    }
    
}
