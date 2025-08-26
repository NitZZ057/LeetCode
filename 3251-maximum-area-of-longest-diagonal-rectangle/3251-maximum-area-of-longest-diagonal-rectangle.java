class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double length = 0.0;
        double currLength = 0.0;
        int maxArea = 0;

        for(int i = 0; i < dimensions.length; i++){
            currLength = Math.sqrt((dimensions[i][0]*dimensions[i][0]) + (dimensions[i][1]*dimensions[i][1]));
            if(currLength > length){
                maxArea = dimensions[i][0]*dimensions[i][1];
                length = currLength;
            }else if(currLength == length){
                if(dimensions[i][0]*dimensions[i][1] > maxArea){
                    maxArea = dimensions[i][0]*dimensions[i][1];
                }
            }
        }

        return maxArea;
    }
}