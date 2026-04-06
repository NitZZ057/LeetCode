class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
            int j = i+1;
            int k = nums.length-1;

            while(j<k){
                int s = nums[i]+nums[j]+nums[k];
                if(s==0){
                    List<Integer> ls = new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(nums[j]);
                    ls.add(nums[k]);
                    if(!set.contains(ls)){
                        set.add(ls);
                        list.add(ls);
                    }
                    j++;
                }else if(s<0){
                    j++;
                }else{
                    k--;
                }
            }
        }

        return list;
    }
}