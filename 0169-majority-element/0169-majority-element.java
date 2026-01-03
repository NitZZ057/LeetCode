class Solution {
    public int majorityElement(int[] nums) {
        int fq = 1;
        int ele = nums[0];

        if(nums.length == 1) return ele;

        for(int i = 1; i < nums.length; i++){
            if(ele == nums[i]){
                fq++;
            }else{
                if(fq==0){
                    fq=1;
                    ele=nums[i];
                }else{
                    fq--;
                }
            }
        }

        return ele;
    }
}