class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int count = 0;
        boolean up = true;
        int cur_row = 0;
        int cur_col = 0;

        int[] res = new int[n*m];

        while(count < n*m){
            if(up){
                while(cur_row >= 0 && cur_col < m){
                    res[count++] = mat[cur_row--][cur_col++]; 
                }

                if(cur_col == m){
                    cur_col--;
                    cur_row+=2;
                }else{
                    cur_row++;
                }

                up = false;
                
            }else{
                while(cur_col >= 0 && cur_row < n){
                    res[count++] = mat[cur_row++][cur_col--]; 
                }

                if(cur_row == n){
                    cur_col+=2;
                    cur_row--;
                }else{
                    cur_col++;
                }

                up = true;
            }
        }

        return res;
    }
}