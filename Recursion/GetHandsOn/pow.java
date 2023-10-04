package Recursion.GetHandsOn;

public class pow {
    public static void main(String[] args) {
        long n = 5;
        System.out.println(n/2);
    }
    public static double myPow(double x, int n) {
        // Write Your Code Here
        long nn = n;
        if(nn<0) nn = -1*nn;
        double val = solve(x, nn);
        if(n<0) return 1.0/val;
        return val;
    }
    private static double solve(double x, long n){
        if(n==0)return 1;
        if(n%2==0){
            return solve(x*x,n/2);
        }else{
            return x*solve(x*x, n/2); 
        }
    }
    
}
