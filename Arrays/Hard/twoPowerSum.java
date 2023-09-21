package Arrays.Hard;


public class twoPowerSum {
/* 
    public static void main(String[] args) {
        List<Integer> inpu = Arrays.asList(1,2,8);
        long t2 = 7;
        Set<Integer> set = block(t2);
        List<Integer> al = new ArrayList<>(set);
        // List<Integer> input2 = new ArrayList<>();
        al.sort(null);
        inpu.sort(null);
        int cnt = 0;
        // int k = 0;
        for(int fi : set){
            // int fi = al.get(i);
            for(int j=0; j<inpu.size(); j++){
                int val = inpu.get(j);
                if(val==fi){
                    inpu.remove(j);
                    break;
                }else if(val>fi){
                    cnt += val-fi;
                    inpu.remove(j);
                    break;
                }
            }
        }
        System.out.println(cnt);

        // if()

    }
    private static Set<Integer> block(long x)
    {
        int k; int i=0; long val=(long) Math.pow(2,i);
        Vector<Long> v = new Vector<Long>();
        //for storing all power of 2 such pow(2,i) <= x
 
        while(val<=x)
        { 
            v.add(val);
            k=i; i++;
            val=(long) Math.pow(2,i);
            //Generating all values such that
            //pow(2,i) <= x
        }
         
        // Performing operation till num become 0
        Set<Integer> ans = new HashSet<Integer>();
        while(x!=0)
        {
            int index = Collections.binarySearch(v,x);
            if(index<0)
            {
                index = -index - 1;
                index--; // Now v[index] <= x and v[index+1] > x
            }
            ans.add(index);// Adding power in ans
            x = x - v.get(index);//reducing x to x-v[index]
        }
        return ans;
    }
    */
}
