class Solution {
    public void sortColors(int[] nums) {
        int i = 0, k = 0, j = nums.length - 1;
        int t  = 0;

        while(k<=j){
            if(i < k && nums[k]==0){
                t = nums[k];
                nums[k] = nums[i];
                nums[i] = t;
                i++; 
            }else if(nums[k]==2){
                t = nums[k];
                nums[k] = nums[j];
                nums[j] = t;
                j--; 
            }else{
                k++;
            }
        }
    }
}