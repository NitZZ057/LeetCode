class Solution {
    public int triangleNumber(int[] nums) {
        if(nums.length < 3) return 0;

        Arrays.sort(nums);
        int count = 0;
        int n = nums.length - 1;

        for(int k = n; k > 1; k--){
            int i = 0, j = k - 1;
            while(i < j){
                if((nums[i]+nums[j]) > nums[k]){
                    count += (j - i);
                    j--;
                }else{
                    i++;
                }
            }
        }

        return count;
    }
}