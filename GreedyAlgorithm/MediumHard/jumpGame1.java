package GreedyAlgorithm.MediumHard;

public class jumpGame1 {
    public static void main(String[] args) {
        
    }
    public static boolean jump_search(int []jump, int n){
        // Write your code here.
        int last = n-1;
        int ind = n-1;
        for(int i=last; i>=0; i--){
            if(jump[i]+i>=ind)ind=i;
        }
        return ind==0?true:false;
    }
}
// testing comment
