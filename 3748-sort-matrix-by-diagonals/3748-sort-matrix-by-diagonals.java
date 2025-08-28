class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int i, j;

        for(int c = m -1; c > 0; c--){
            for( i =0,j = c; i < n &j < m; i++,j++){
                int x = i;
                int y = j;
                for(int k = i+1,l = j+1; k < n & l < m; k++,l++){
                    if(grid[x][y] > grid[k][l]){
                        x = k;
                        y = l;
                    }
                }
                int t = grid[i][j];
                grid[i][j] = grid[x][y];
                grid[x][y] = t;
            }
        }

        for(int c = 0; c < n; c++){
            for(i = c,j=0; i < n &j < m; i++,j++){
                int x = i;
                int y = j;
                for(int k = i+1,l = j+1; k < n & l < m; k++,l++){
                    if(grid[x][y] < grid[k][l]){
                        x = k;
                        y = l;
                    }
                }
                int t = grid[i][j];
                grid[i][j] = grid[x][y];
                grid[x][y] = t;
            }
        }

        return grid;
    }
}