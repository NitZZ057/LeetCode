class Solution {
    public int islandPerimeter(int[][] grid) {
        int ans = 0;

        for(int i  = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j]==1){
                    if(j == 0){
                        ans++;
                    }else if(grid[i][j-1]==0){
                        ans++;
                    }

                    if(i == 0){
                        ans++;
                    }else if(grid[i-1][j]==0){
                        ans++;
                    } 

                    if(j == grid[0].length-1) {
                        ans++;
                    }else if(grid[i][j+1]==0){
                        ans++;
                    }

                    if(i == grid.length-1 ) {
                        ans++;
                    }else if(grid[i+1][j]==0){
                        ans++;
                    }
                }
            }
        }

        return ans;
    }
}