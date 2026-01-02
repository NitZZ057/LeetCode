import java.util.*;

class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        long[] prefix = new long[n + 1];
        
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        
        Deque<Integer> dq = new ArrayDeque<>();
        int result = Integer.MAX_VALUE;
        
        for (int i = 0; i <= n; i++) {
            // Try to shrink from the front
            while (!dq.isEmpty() && prefix[i] - prefix[dq.peekFirst()] >= k) {
                result = Math.min(result, i - dq.pollFirst());
            }
            
            // Maintain increasing order of prefix sums
            while (!dq.isEmpty() && prefix[i] <= prefix[dq.peekLast()]) {
                dq.pollLast();
            }
            
            dq.offerLast(i);
        }
        
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
