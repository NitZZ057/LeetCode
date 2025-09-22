class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFreq = Integer.MIN_VALUE;
        int count = 0;

        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
            if(maxFreq < map.get(n)){
                maxFreq = map.get(n);
                count = 1;
            }else if(maxFreq == map.get(n)){
                count++;
            }
        }

        return count * maxFreq;
    }
}