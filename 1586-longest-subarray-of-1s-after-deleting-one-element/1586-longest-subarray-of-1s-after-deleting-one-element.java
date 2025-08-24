class Solution {
    public int longestSubarray(int[] nums) {
        int prev = 0;
        int curr = 0;
        int max = 0;
        int zeros = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i]==0){
                zeros++;
                prev = curr;
                curr = 0;
            }else{
                curr++;
                if((prev + curr) > max){
                    max = prev + curr;
                }
            }
        }

        if(zeros == 0){
            return nums.length - 1;
        }else{
            return max;
        }
    }
}