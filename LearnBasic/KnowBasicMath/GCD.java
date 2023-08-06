class GCD{
    public static void main(String[] args){
        System.out.println("Rama");
        System.out.println(GCD(18, 24));
    }


    private static int GCD(int m, int n){
        
        if(m>n){ // 6, 5
            n = m+n; //11
            m = n-m; //11-6 = 5
            n = n-m; //11-5 = 6
        }
        if(m==0){
            return n;
        }else{
            return GCD(m, n%m);
        }
    }
}