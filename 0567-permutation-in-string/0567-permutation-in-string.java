class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1f = new int[26];
        int[] window = new int[26];

        for (char c : s1.toCharArray()) {
            s1f[c - 'a']++;
        }

        int matches = 0;

        for (int i = 0; i < 26; i++) {
            if (s1f[i] == window[i]) matches++;
        }

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {
            int index = s2.charAt(right) - 'a';
            window[index]++;

            if (window[index] == s1f[index]) matches++;
            else if (window[index] == s1f[index] + 1) matches--;

            if (right - left + 1 > s1.length()) {
                int leftIndex = s2.charAt(left) - 'a';
                window[leftIndex]--;

                if (window[leftIndex] == s1f[leftIndex]) matches++;
                else if (window[leftIndex] == s1f[leftIndex] - 1) matches--;

                left++;
            }

            if (matches == 26) return true;
        }

        return false;
    }
}