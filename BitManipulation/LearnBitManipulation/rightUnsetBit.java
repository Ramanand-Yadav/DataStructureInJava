package BitManipulation.LearnBitManipulation;

public class rightUnsetBit {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(setBits(n));
    }
    public static int setBits(int N){
        int num = N;
        int cnt = 0;
        while((num&1)!=0 && (num>1)){
            cnt++;
            num>>=1;
        }
        return (N|(1<<cnt));
    }

}
