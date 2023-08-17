package Arrays.Hard;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class slidingMax{
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int[] val = solution(arr, 3);
        for(int v : val){
            System.out.print(v+" ");
        }
    }
    private static int[] solution(int[] arr, int k){
        int[] ans = new int[arr.length-k+1];
        LinkedList<Integer> deq = new LinkedList<>();
        int j=0;
        for(int i=0; i<arr.length; i++){
            while(!deq.isEmpty() && arr[deq.getFirst()]<=arr[i]) deq.removeFirst();
            deq.add(i);
            if(i-j+1==k){
                ans[j]=arr[deq.getFirst()];
                if(deq.getFirst()==j) deq.removeFirst();
                j++;
            }
        }
        return ans;
    }
}