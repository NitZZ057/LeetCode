class Spreadsheet {
    HashMap<Character,Integer> map = new HashMap<>();
    int[][] sheet;
    public Spreadsheet(int rows) {
        sheet = new int[rows+1][27];

        for(int i = 1; i < 27; i++){
            map.put((char)('A' + i - 1),i);
        }
    }
    
    public void setCell(String cell, int value) {
        int col = map.get(cell.charAt(0));
        int row = Integer.parseInt(cell.substring(1));
        sheet[row][col] = value;
    }
    
    public void resetCell(String cell) {
        int col = map.get(cell.charAt(0));
        int row = Integer.parseInt(cell.substring(1));
        sheet[row][col] = 0;
    }
    
    public int getValue(String formula) {
        String s = formula.substring(1); // remove '='
        int plusIdx = s.indexOf('+');

        String left = s.substring(0, plusIdx);
        String right = s.substring(plusIdx + 1);

        return solve(left) + solve(right);
    }

    private int solve(String s) {
        if (Character.isDigit(s.charAt(0))) {
            return Integer.parseInt(s);
        }
        int col = s.charAt(0) - 'A';
        int row = Integer.parseInt(s.substring(1));
        return sheet[row][col+1];
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */