package BinarySearch.BSONAnswer;

public class medianTwoSortedArr {
    public static void main(String[] args) {
        
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int cnt = 0;
        int i=0;int j=0;
        int firste = 0; int sece = 0;
        while(i<n1 && j<n2 && cnt<=(n1+n2)/2){
            if(cnt==(((n1+n2)/2)-1)){
                if(nums1[i]<nums2[j]){
                    firste = nums1[i];
                }else{
                    firste = nums2[j];
                }
            }
            if(cnt==((n1+n2)/2)){
                if(nums1[i]<nums2[j]){
                    sece = nums1[i];
                }else{
                    sece = nums2[j];
                }
            }
            if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
            cnt++;
        }
        while(i<n1 && cnt<=(n1+n2)/2){
            if(cnt==(((n1+n2)/2)-1)){
                firste = nums1[i];
            }
            if(cnt==((n1+n2)/2)){
                sece = nums1[i];
            }
            i++;cnt++;
        }
        while(j<n2 && cnt<=(n1+n2)/2){
            if(cnt==(((n1+n2)/2)-1)){
                firste = nums2[j];
            }
            if(cnt==((n1+n2)/2)){
                sece = nums2[j];
            }
            j++;cnt++;
        }
        if(((n1+n2)%2)==0) return (double)(firste+sece)/2.0;
        return (double) sece;
    }
}
