class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        // frequency array for values [-50, 50]
        int[] cnt = new int[101];

        int left = 0;

        for (int right = 0; right < n; right++) {
            // add current element
            cnt[nums[right] + 50]++;

            // when window size becomes k
            if (right - left + 1 == k) {
                ans[left] = getBeauty(cnt, x);

                // remove left element
                cnt[nums[left] + 50]--;
                left++;
            }
        }

        return ans;
    }

    private int getBeauty(int[] cnt, int x) {
        int count = 0;

        for (int i = 0; i < 50; i++) { // only negatives
            count += cnt[i];
            if (count >= x) {
                return i - 50;
            }
        }

        return 0;
    }
}
