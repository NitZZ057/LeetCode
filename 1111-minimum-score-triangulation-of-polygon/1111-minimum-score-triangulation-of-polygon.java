class Solution {
    int[][] dp;

    public int solve(int[] arr, int i, int j){
        if(j-i+1 < 3){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int result = Integer.MAX_VALUE;

        for(int k = i+1; k < j; k++){
            int s = arr[i]*arr[k]*arr[j] 
                    + solve(arr,i,k)
                    + solve(arr,k,j);
            result = Math.min(result,s);
        }

        return dp[i][j] = result;
    }

    public int minScoreTriangulation(int[] values) {
        int n = values.length;

        dp = new int[n][n];

        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(values, 0, n-1);
    }
}