class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int mod = 1000000007;
        int n = nums.length, low = 0, high = n - 1;
        int[] pow = new int[n];
        Arrays.fill(pow, 1);
        for (int i = 1; i < n; ++i) {
            pow[i] = (pow[i - 1] * 2) % mod;
        }
        int res = 0;
        while (low <= high) {
            if (nums[low] + nums[high] > target)
                high--;
            else {
                res = (res + pow[high - low]) % mod;
                low++;
            }
        }
        return res % mod;
    }
}