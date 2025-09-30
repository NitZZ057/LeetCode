class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;

        int[] temp = new int[n-1];

        while(0 < n){
            int l = n-1;
            for(int i = 0; i < l; i++){
                temp[i] = (nums[i] + nums[i+1])%10;
            }

            for(int i = 0; i < l; i++){
                nums[i] = temp[i];
            }

            n--;
        }

        return nums[0];
    }
}