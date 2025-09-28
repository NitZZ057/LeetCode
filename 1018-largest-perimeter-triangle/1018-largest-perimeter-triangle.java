class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for(int i = nums.length -2; i > 0; i--){
            if((nums[i] + nums[i-1]) > nums[i+1]){
                return nums[i-1] + nums[i] + nums[i+1];
            }
        }

        return 0;
    }
}