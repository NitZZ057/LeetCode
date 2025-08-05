class Solution {
    public void nextPermutation(int[] nums) {
        int breakInd = -1;

        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i]<nums[i+1]){
                breakInd = i;
                break;
            }
        }

        if(breakInd==-1){
            reverse(nums, 0, nums.length-1);
            return;
        }

        for(int i = nums.length-1; i >= 0; i--){
            if(nums[i] > nums[breakInd]){
                int t = nums[i];
                nums[i] = nums[breakInd];
                nums[breakInd] = t;
                break;
            }
        }

        reverse(nums, breakInd+1, nums.length-1);
        
    }

    public void reverse(int[] arr, int l, int h){
        while(l<h){
            int t = arr[l];
            arr[l] = arr[h];
            arr[h] = t;
            h--;
            l++;
        }
    }
}