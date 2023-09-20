package String.Basic;

public class Rotation {
    public static void main(String[] args) {
        
    }
    public boolean rotateString(String s, String goal) {
        if(goal.length()!=s.length()) return false;
        String str = s + s;
        int res = str.indexOf(goal);
        if(res == -1) return false;
        return true;
    }
}
