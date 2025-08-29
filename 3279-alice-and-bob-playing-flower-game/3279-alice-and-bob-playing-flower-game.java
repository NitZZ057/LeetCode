class Solution {
    public long flowerGame(int n, int m) {
        long oddN = (n+1L)/2L;
        long eveN = n/2L;
        long oddM = (m+1L)/2L;
        long eveM = m/2L;

        return (oddN*eveM) + (eveN*oddM);
    }
}