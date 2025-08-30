class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] != '.'){
                    if(!set.add(i+"R"+board[i][j]) || !set.add(j+"C"+board[i][j]) || !set.add(i/3+"R"+j/3+"C"+board[i][j])){
                        return false;
                    }
                }
            }
        }

        return true;
    }
}