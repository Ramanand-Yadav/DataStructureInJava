package BinarySearch.BSONAnswer;
import java.lang.reflect.Array;
import java.util.*;
public class allocateBooks {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(25, 46, 28, 49, 24));
        int n = 5;
        int m = 4;
        // int ans = findPages(arr, n, m);
        int ans = solve(arr, n, m);
        System.out.println("The answer is: " + ans);
    }

    public static int findPages(List<Integer> arr, int n, int m) {
        // book allocation impossible
        if (m > n)
            return -1;

        int low = Collections.max(arr);
        int high = arr.stream().mapToInt(Integer::intValue).sum();

        for (int pages = low; pages <= high; pages++) {
            if (countStudents(arr, pages) == m) {
                return pages;
            }
        }
        return low;
    }

    private static int solve(List<Integer> arr, int n, int m){
        int l = Collections.max(arr);
        int r = arr.stream().mapToInt(Integer::intValue).sum();

        if(m>n) return -1;
        // for(int i=l; i<=r; i++){
        //     if(countStudents(arr,i)==m){
        //         return i;
        //     }
        // }
        while(l<=r){
            int mid = (l+r)/2;
            if(countStudent(arr, n, mid)<=m){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return l;
    }

    private static int countStudent(List<Integer>arr, int n, int pages){
        int student = 1;
        int pagesStudent = 0;
        for(int i=0; i<n; i++){
            if(pagesStudent+arr.get(i) <= pages){
                pagesStudent+=arr.get(i);
            }else{
                student++;
                pagesStudent=arr.get(i);
            }
        }
        return student;
    }
    public static int countStudents(List<Integer> arr, int pages) {
        int n = arr.size(); // size of array
        int students = 1;
        long pagesStudent = 0;
        for (int i = 0; i < n; i++) {
            if (pagesStudent + arr.get(i) <= pages) {
                // add pages to current student
                pagesStudent += arr.get(i);
            } else {
                // add pages to next student
                students++;
                pagesStudent = arr.get(i);
            }
        }
        return students;
    }
}
