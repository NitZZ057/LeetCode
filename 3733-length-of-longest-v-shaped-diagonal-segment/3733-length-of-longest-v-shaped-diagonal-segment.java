class Solution {
    int[][] directions = {{-1,-1},{-1,1},{1,1},{1,-1}};
    Integer[][][][][] dp; 
    int row,col;
    public int lenOfVDiagonal(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        dp = new Integer[row][col][2][2][4];

        int maxLength = 0;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j]==1){
                    for(int d = 0; d < 4; d++){
                        int ni = directions[d][0];
                        int nj = directions[d][1];
                        maxLength = Math.max(maxLength, 1 + dfs(grid, i + ni, j + nj, 0, 2, d));
                    }
                }
            }
        }

        return maxLength;
    }

    public int dfs(int[][] grid, int r, int c, int turn, int t, int d){
        if(r < 0 || r >= row || c < 0 || c >= col || grid[r][c] != t) return 0;

        int tpos = t==2 ? 1 : 0;
        if(dp[r][c][turn][tpos][d] != null){
            return dp[r][c][turn][tpos][d];
        }

        int nextNum = t == 2 ? 0 : 2;
        int maxLength = 0;
        if(turn == 1){
            maxLength  = Math.max(maxLength,1+dfs(grid, r + directions[d][0], c + directions[d][1], 1, nextNum, d));
        }else{
            maxLength = Math.max(maxLength, 1+dfs(grid, r + directions[d][0], c + directions[d][1], 0, nextNum, d));
            int nd = (d + 1) % 4;
            maxLength = Math.max(maxLength,1+dfs(grid, r + directions[nd][0], c + directions[nd][1], 1, nextNum, nd));
        }
        dp[r][c][turn][tpos][d] = maxLength;
        return maxLength;
        
    }
}