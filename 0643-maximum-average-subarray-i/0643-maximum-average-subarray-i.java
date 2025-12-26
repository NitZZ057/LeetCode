class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        double ans = Integer.MIN_VALUE;
        double sum = 0;

        for(int i = 0; i < n; i++){
            if(i<k){
                sum+=nums[i];
            }else{
                ans = Math.max(ans, sum/k);

                sum = sum - nums[i-k] + nums[i];
            }
        }

        ans = Math.max(ans, sum/k);

        return ans;

    }
}