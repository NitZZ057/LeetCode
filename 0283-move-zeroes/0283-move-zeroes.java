class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        
        outerloop:
        while(i< nums.length && j < nums.length){
            if(nums[i]==0){
                while(nums[j]==0){
                    j++;
                    if(j >= nums.length){
                        break outerloop;
                    }
                }
                nums[i] = nums[j];
                nums[j] = 0;
            }
            i++;
            if(j<i){
                j=i;
            }
        }

    }
}