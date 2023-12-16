package SlidingWindowTwoPointer.MediumProblems;

import java.util.HashMap;

public class maxFruits {
    public static void main(String[] args) {
        int[] arr = {10,8,25,3,23,3,3,28,2,24,7,2,22,12,18,16,1,16,6,1,6,20,10,3,2,0,25,5,14}; 
        // int[] arr = {1, 16, 6, 1, 6, 20, 10};
        System.out.println(findMaxFruits(arr, arr.length));
    }
    public static int findMaxFruits(int[] arr, int n) {
        if (n < 3) {
            return n;
        }
        HashMap<Integer, Integer> fruitCounts = new HashMap<>();
        int maxFruits = 0;
        int start = 0;
// here in loop we are maintaining a window of 2 if we have map with more then 2 fruits then we are just removing the fruits from the start with less number of count
        for (int end = 0; end < n; end++) {
            int fruit = arr[end];
            fruitCounts.put(fruit, fruitCounts.getOrDefault(fruit, 0) + 1);
            while (fruitCounts.size() > 2) {
                int removedFruit = arr[start];
                fruitCounts.put(removedFruit, fruitCounts.get(removedFruit) - 1);
                if (fruitCounts.get(removedFruit) == 0) {
                    fruitCounts.remove(removedFruit);
                }
                start++;
            }
            maxFruits = Math.max(maxFruits, end - start + 1);
        }
        return maxFruits;
    }
}

