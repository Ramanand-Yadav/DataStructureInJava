package LeetCode.Weekly382;

import java.util.Arrays;

public class maximumPalindrome {
    public static void main(String[] args) {
        
    }
    public static int maxPalindromesAfterOperations(String[] words) {
		int map[] = new int[26], count = 0, result = 0;
		for (String word : words) {
			for (char c : word.toCharArray()) {
				count += map[c - 'a']++ % 2;
			}
		}
		Arrays.sort(words, (o, p) -> o.length() - p.length());
		for (String word : words) {
			result += (count -= word.length() / 2) < 0 ? 0 : 1;
		}
		return result;
	}
}
