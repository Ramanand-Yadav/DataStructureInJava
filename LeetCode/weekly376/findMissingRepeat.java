package LeetCode.weekly376;

import java.util.HashSet;

public class findMissingRepeat {
    public static void main(String[] args) {
        
    }
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer>set = new HashSet<>();
        int repeat=0;
        int sum=0;
        int n = grid.length;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid.length; j++){
                if(set.contains(grid[i][j])){
                    repeat=grid[i][j];
                }
                sum+=grid[i][j];
                set.add(grid[i][j]);
            }
        }
        int[] ans = new int[2];
        ans[0]=repeat;
        ans[1] = ((n*(n+1))/2)-sum+repeat;
        return ans;
    }
}
