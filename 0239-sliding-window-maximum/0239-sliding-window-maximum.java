class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        List<Integer> ls = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }

            dq.offerLast(i);

            if(dq.peekFirst() < i-k+1){
                dq.pollFirst();
            }

            if(i >= k-1){
                ls.add(nums[dq.peekFirst()]);
            }
        }

        int[] a = new int[ls.size()];
        for(int i = 0; i < ls.size(); i++){
            a[i] = ls.get(i);
        }

        return a;
    }
}