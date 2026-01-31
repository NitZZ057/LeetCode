class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();

        int j = 0;
        long sum = 0;
        long ans = 0;

        for (int i = 0; i < n; i++) {

            // add current element
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            sum += nums[i];

            // shrink window if duplicate found
            while (freq.get(nums[i]) > 1) {
                freq.put(nums[j], freq.get(nums[j]) - 1);
                sum -= nums[j];
                j++;
            }

            // ensure window size k
            if (i - j + 1 > k) {
                freq.put(nums[j], freq.get(nums[j]) - 1);
                sum -= nums[j];
                j++;
            }

            // valid window
            if (i - j + 1 == k) {
                ans = Math.max(ans, sum);
            }
        }

        return ans;
    }
}
