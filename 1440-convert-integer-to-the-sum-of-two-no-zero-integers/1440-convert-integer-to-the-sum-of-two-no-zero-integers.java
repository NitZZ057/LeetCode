class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] ans = new int[2];

        for(int i = 1; i < n; i++){
            if(isNoZero(i) && isNoZero(n-i)){
                ans[0] = i;
                ans[1] = n-i;
                break;
            }
        }

        return ans;
    }

    public boolean isNoZero(int e){
        while(e > 0){
            if(e%10 == 0) return false;
            e = e/10;
        }

        return true;
    }
}