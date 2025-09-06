class Solution {
    public long minOperations(int[][] queries) {
        long ans = 0;

        for(int[] q: queries){
            ans += (solve(q[0],q[1]) + 1)/2;
        }

        return ans;
    }

    public long solve(int l, int r){
        long L = 1;
        long S = 1;
        long steps = 0;

        while(L <= r){
            long R = L*4 - 1;

            long start = Math.max(L, (long)l);
            long end = Math.min(R, (long)r);

            if(start <= end){
                steps += (end - start +1)*S;
            }

            S++;
            L = L*4;
        }

        return steps;
    }
}