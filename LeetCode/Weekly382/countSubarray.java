package LeetCode.Weekly382;

public class countSubarray {
    public static void main(String[] args) {
        int[] nums = {846123688,626200286,846123688};
        int[] pattern = {1};
        System.out.println(countMatchingSubarrays(nums, pattern));
    }
    public static int countMatchingSubarrays(int[] nums, int[] pattern) {
		int s[] = new int[nums.length + pattern.length - 1], count = 0;
		for (int i = 0; i < pattern.length; i++) {
			s[i] = pattern[i];
		}
		for (int i = 1; i < nums.length; i++) {
			s[i + pattern.length - 1] = Integer.signum(nums[i] - nums[i - 1]);
		}
		int[] z = z(s);
		for (int i = pattern.length; i < s.length; i++) {
			count += z[i] < pattern.length ? 0 : 1;
		}
		return count;
	}

	private static int[] z(int[] s) {
		int[] z = new int[s.length];
		for (int i = 1, x = 0, y = 0; i < s.length; i++) {
			for (z[i] = Math.max(0, Math.min(z[i - x], y - i + 1)); i + z[i] < s.length
					&& s[z[i]] == s[i + z[i]]; y = i + z[x = i]++) {
			}
		}
		return z;
	}
}
