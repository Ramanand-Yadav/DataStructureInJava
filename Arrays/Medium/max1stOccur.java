package Arrays.Medium;

import java.util.LinkedList;

public class max1stOccur {
    public static void main(String[] args) {
        int n = 6;
        int m = 3;
        int[] vehicle = {0,1,0,0,1,0};
        System.out.println(traffic(n, m, vehicle));
    }
    private static int traffic(int n, int m, int []vehicle) {
        // Write your code here.
        int ans = 0;
        LinkedList<Integer> al = new LinkedList<>();
        for(int i=0; i<n; i++){
            if(vehicle[i]==1){
                al.add(1);
            }else{
                if(m>0){
                    al.add(0);
                    m = m-1;
                }else{
                    while(!al.isEmpty() && al.getFirst()!=0){
                        al.removeFirst();
                    }
                    if(!al.isEmpty()){
                        al.removeFirst();
                        al.add(0);
                    }

                }
            }
            ans = Math.max(ans, al.size());
        }
        return ans;
    }
    
}
