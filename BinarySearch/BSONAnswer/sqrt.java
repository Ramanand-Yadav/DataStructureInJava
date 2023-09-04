package BinarySearch.BSONAnswer;

public class sqrt {
    public static void main(String[] args) {
        
    }
    public static int sqrt1(long N){
        return (int) Math.sqrt(N);
    }
    public static int sqrtN(long N) {
		/*
		 * Write your code here
		 */
		 int l=1,r=(int) N;
		 int ans = 1;
		 while(l<=r){
			 long mid = (l+r)/2;
			 long val = mid*mid;
			 if(val<=N){
				 ans = (int) mid;
				 l =(int) mid+1;
			 }else{
				 r =(int) mid-1;
			 }
		 }
		 return ans;
	} 
}
