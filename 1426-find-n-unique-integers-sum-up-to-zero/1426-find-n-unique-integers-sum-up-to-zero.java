class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int i = 0;
        int e = 1;

        if(n%2!=0){
            ans[i] = 0;
            i++;
        }

        while( i < n){
            ans[i] = e;
            i++;
            ans[i] = -e;
            i++;
            e++;
        }

        return ans;
    }
}