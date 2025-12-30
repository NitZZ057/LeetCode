class Solution {
    public int longestOnes(int[] nums, int k) {
        if(nums.length == 0) return 0;

        int maxLength = Integer.MIN_VALUE;
        int count = 0;

        int i = 0, j = 0;

        while(i < nums.length){
            if(nums[i]==0){
                count++;
            }
            
            while(count > k){
                if(nums[j]==0){
                    count--;
                }

                j++;
            }

            maxLength = Math.max(maxLength, i-j+1);

            i++;
        }

        return maxLength;
    }
}