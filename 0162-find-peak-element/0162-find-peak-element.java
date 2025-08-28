class Solution {
    public int findPeakElement(int[] nums) {
        int maxInd = 0;

        if(nums.length == 1) return maxInd;

        for(int i = 1; i < nums.length - 1; i++){
            if(nums[i-1] < nums[i] && nums[i+1] < nums[i]){
                maxInd = i;
            }
        }

        if(maxInd == 0 && nums[0] < nums[1]) maxInd = nums.length -1;

        return maxInd;
    }
}