package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class SortedUnion {
    public static void main(String[] args) {
        
    }
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        int i=0;int j=0;int n=a.length; int m=b.length;
        List<Integer> al = new ArrayList<>();
        while(i<n && j<m){
            if(a[i]<b[j]){
                al.add(a[i]);
                int val = a[i];
                while(i<n && a[i]==val) i++;
            }else if(a[i]==b[j]){
                int val = a[i];
                al.add(a[i]);
                while(i<n && a[i]==val) i++;
                while(j<m && b[j]==val) j++;
            }else{
                al.add(b[j]);
                int val = b[j];
                while(j<m && b[j]==val) j++;
            }

        }
        while(i<n){
            al.add(a[i]);
            int val = a[i];
            while(i<n && a[i]==val) i++;
        }
        while(j<m){
            al.add(b[j]);
            int val = b[j];
            while(j<m && b[j]==val) j++;
        }
        return al;
    }
    
}
