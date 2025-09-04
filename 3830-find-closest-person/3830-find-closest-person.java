class Solution {
    public int findClosest(int x, int y, int z) {
        int o = Math.abs(z-x);
        int t = Math.abs(z-y);

        if(o<t){
            return 1;
        }

        if(t<o){
            return 2;
        }

        return 0;
    }
}