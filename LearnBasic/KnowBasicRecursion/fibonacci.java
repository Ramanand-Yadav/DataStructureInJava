package LearnBasic.KnowBasicRecursion;

public class fibonacci {
    public static void main(String[] args){
        System.out.println(fib(5));
    }
    private static int fib(int n) {
        if(n==0){
            return 0;
        }if(n==1){
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
    
}
