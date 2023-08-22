import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leadersinArray {
    public static void main(String[] args) {
        
    }
    public static List< Integer > superiorElements(int []a) {
        // Write your code here.
        List<Integer> al = new ArrayList<>();
        int n = a.length;
        al.add(a[n-1]);
        int ge = a[n-1];
        for(int i=a.length-2; i>=0; i--){
            if(a[i]>ge){
                al.add(a[i]);
                ge = a[i];
            }
        }
        Collections.sort(al);
        return al;
    }
    
}
