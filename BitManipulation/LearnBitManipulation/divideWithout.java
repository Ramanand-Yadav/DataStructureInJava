package BitManipulation.LearnBitManipulation;

public class divideWithout {
    public static void main(String[] args) {
        int dividend = 25;
        int divisor = 1;
        divideTwoInteger(dividend, divisor);
    }
    public static int divideTwoInteger(int dividend, int divisor) {
        // Write your code here.
        long sign=((dividend<0)^(divisor<0))?-1:1;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int quote = 0;
        while(dividend>=divisor){
            dividend-=divisor;
            quote++;
        }
        if(sign==-1){
            quote = -quote;
        }
        return quote;
    }
}
