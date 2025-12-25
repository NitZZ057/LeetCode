class Solution {
    public int characterReplacement(String s, int k) {
        int[] map = new int[26];

        int l = 0, r = 0, longest = 0, maxF = 0;

        while(r < s.length()){
            map[s.charAt(r)-'A']++;
            maxF = Math.max(maxF, map[s.charAt(r)-'A']);

            while((r-l+1 - maxF) > k){
                map[s.charAt(l)-'A']--;
                l++;
            }

            longest = Math.max(r-l+1, longest);

            r++;
        }

        return longest;
    }
}