class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] fq = new int[nums.length+1];

        for(int i = 0; i < nums.length; i++){
            fq[nums[i]] = 1;
        }

        ArrayList<Integer> l = new ArrayList<>();

        for(int i = 1; i < fq.length; i++){
            if(fq[i]!=1){
                l.add(i);
            }
        }

        return l;
    }
}