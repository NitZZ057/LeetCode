class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;

        int[] ans = new int[n];

        Arrays.sort(potions);

        for(int i = 0; i < n; i++){
            ans[i] = findPotions(0,m-1,spells[i],potions, success);
        }

        return ans;
    }

    public int findPotions(int l, int h, int spell, int[] potions, long success) {
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if ((long) spell * potions[mid] >= success) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return potions.length - l;
    }
}