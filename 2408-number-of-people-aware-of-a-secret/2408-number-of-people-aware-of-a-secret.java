class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int M = (int)1e9+7;
        int[] dp = new int[n+1];
        dp[1] = 1;

        int count = 0;
        for(int d = 2; d <= n; d++){
            if(d-delay > 0){
                count = (count + dp[d-delay]) % M;
            }

            if(d-forget > 0){
                count = (count - dp[d-forget] + M) % M;
            }

            dp[d] = count;
        }


        int result = 0;
        for(int d = n-forget+1; d <= n; d++){
            if(d > 0){
                result = (result + dp[d]) % M;
            }
        }

        return result;
    }
}