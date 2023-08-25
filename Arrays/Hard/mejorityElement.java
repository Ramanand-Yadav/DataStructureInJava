package Arrays.Hard;

import java.util.ArrayList;
import java.util.List;

public class mejorityElement {
    public static void main(String[] args) {
        
    }

    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length; 
        int min =(int) n/3+1;
        List<Integer> al = new ArrayList<>();
        // Map<Integer,Integer> mp = new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        // }
        // for(Map.Entry<Integer, Integer> en : mp.entrySet()){
        //     int val = en.getValue();
        //     if(val>=min){
        //         al.add(en.getKey());
        //     }
        // }
        // return al;
        int cnt1=0,cnt2=0,ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(cnt1==0 && nums[i]!=ele2){
                cnt1++;
                ele1 = nums[i];
            }else if(cnt2==0 && nums[i]!=ele1){
                cnt2++;
                ele2 = nums[i];
            }else if(ele1==nums[i]) cnt1++;
            else if(ele2==nums[i]) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;cnt2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==ele1)cnt1++;
            else if(nums[i]==ele2)cnt2++;
        }
        if(cnt1>=min){
            al.add(ele1);
        }
        if(cnt2>=min){
            al.add(ele2);
        }
        return al;

    }
}
