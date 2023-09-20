
public class GCD{
    public static void main(String[] args){
        System.out.println("Rama");
        System.out.println(GCD1(18, 24));
    }


    private static int GCD1(int m, int n){
        
        if(m>n){ // 6, 5
            n = m+n; //11
            m = n-m; //11-6 = 5
            n = n-m; //11-5 = 6
        }
        if(m==0){
            return n;
        }else{
            return GCD1(m, n%m);
        }
    }
}