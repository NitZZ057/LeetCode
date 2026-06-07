class Solution {
    public void sortColors(int[] nums) {
        int i = 0,k = 0;
        int j = nums.length - 1;

        if(nums.length == 1) return;

        while(k<=j){
            if(i<k && nums[k]==0){
                nums[k] = nums[i];
                nums[i] = 0;
                i++;
            }else if(nums[k] == 2){
                nums[k] = nums[j];
                nums[j] = 2;
                j--;
            }else{
                k++;
            }
        }
    }
}