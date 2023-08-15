package Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class removeDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,2,3,3,3,4,4,5,5));
        int val = removeDuplicates(arr);
        System.out.println(val);
    }
    public static int removeDuplicates(ArrayList<Integer> arr) {
		if(arr.size()==1){
			return 1;
		}
		for(int i=arr.size()-1; i>0; i--){
			int ls = arr.get(i);
			int st = arr.get(i-1);
            // System.out.println(ls+" "+st);
			if(ls==st){
				arr.remove(i);
			}
		}
        // for(int val : arr){
        //     System.out.print(val+" ");
        // }
		return arr.size();
	}
    
}
