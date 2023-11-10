package BitManipulation.LearnBitManipulation;

public class introbit {
    public static void main(String[] args) {
        int val = 1<<2;
        System.out.println(9&val);
        int set = 9|(1<<2);
        System.out.println(set);
        int val2 = 13&(~(1<<(2)));
        System.out.println(val2);
    }
    public static int[] bitManipulation(int num, int i){
        // Write your code here.
        int[] ans = new int[3];
        if((num&(1<<(i-1)))!=0){
            ans[0]=1;
        }else{
            ans[0]=0;
        }
        ans[1] = (num|(1<<(i-1)));
        ans[2] = (num&(~(1<<(i-1))));
        return ans;
    }
}
