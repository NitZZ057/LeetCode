class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        allPermute(nums, ans, 0);

        return ans;
    }

    public void allPermute(int[] nums, List<List<Integer>> ans, int ind){
        if(ind == nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int n: nums) ds.add(n);
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = ind; i < nums.length; i++){
            swap(i,ind,nums);
            allPermute(nums,ans,ind+1);
            swap(i,ind,nums);
        }
    }

    public void swap(int i, int j, int[] nums){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}