class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i = 0,j = 0,sum = 0,min = Integer.MAX_VALUE;

        while(j < n){
            sum += nums[j];  
            while(sum >= target && i < j){
                if(sum>= target){
                    min = Math.min(min, j - i +1);
                }
                sum -= nums[i];
                i++;
            }

            if(sum>= target){
                min = Math.min(min, j - i +1);
            }

            j++;
        }

        return min == Integer.MAX_VALUE? 0 : min;
    }
}