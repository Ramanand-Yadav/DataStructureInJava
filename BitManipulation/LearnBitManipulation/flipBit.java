package BitManipulation.LearnBitManipulation;

public class flipBit {
    public static void main(String[] args) {
        int st = 3;
        int goal = 4;
        System.out.println(minBitFlips(st, goal));
    }
    public static int minBitFlips(int start, int goal) {
        int cnt = 0;
        for(int i=0; i<32; i++){
            int num = 1<<i;
            int bitS = (num&start)>0?1:0;
            int bitG = (num&goal)>0?1:0;
            // System.out.println(i+" "+num+" "+bitS+" "+bitG);
            if(bitS!=bitG){
                cnt++;
            }
        }
        return cnt;
    }
}
