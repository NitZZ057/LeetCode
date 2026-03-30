class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxC = 0;
        int currC = 0;
        int have = 0;
        int left = 0;

        for(int right = 0; right < nums.length; right++){
            if(nums[right]==0){
                have++;
            }else{
                currC++;
            }

            while(have>k){
                maxC = Math.max(maxC, currC+have-1);
                if(nums[left]==0){
                    have--;
                }else{
                    currC--;
                }
                left++;
            }
        }

        maxC = Math.max(maxC, currC+have);
        return maxC;
    }
}