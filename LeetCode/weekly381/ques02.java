package LeetCode.weekly381;

public class ques02 {
    public static void main(String[] args) {
        
    }
    public int[] countOfPairs(int n, int x, int y) {
        int[] result = new int[n];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i != j) {
                    int distance = Math.min(Math.min(Math.abs(i - j), Math.abs(i - x) + 1 + Math.abs(y - j)),
                            Math.abs(i - y) + 1 + Math.abs(x - j));
                    result[distance - 1]++;
                }
            }
        }

        return result;
    }
}
