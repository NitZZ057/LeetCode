class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return func(nums, k) - func(nums, k-1);
    }

    public int func(int[] nums, int k){
        int n = nums.length;

        int i = 0;
        int dist = 0;
        int ans = 0;

        Map<Integer, Integer> fq = new HashMap<>();

        for(int j = 0; j < n; j++){
            fq.put(nums[j],fq.getOrDefault(nums[j],0)+1);

            if(fq.get(nums[j])==1) dist++;

            while(dist>k){
                fq.put(nums[i],fq.get(nums[i])-1);
                if(fq.get(nums[i])==0) dist--;
                i++;
            }

            ans += j-i+1;
        }

        return ans;
    }
}