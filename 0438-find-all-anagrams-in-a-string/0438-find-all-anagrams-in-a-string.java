class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        int n = s.length();
        int k = p.length();

        if(n < k) return ans;

        int[] pat = new int[26];
        int[] str = new int[26];

        for(int i = 0; i < k; i++){
            str[s.charAt(i)-'a']++;
            pat[p.charAt(i)-'a']++;
        }

        if(Arrays.equals(pat, str)) ans.add(0);

        for(int i = 1; i <= n - k; i++){
            str[s.charAt(i-1)-'a']--;
            str[s.charAt(i+k-1)-'a']++;
            if(Arrays.equals(pat, str)) ans.add(i);
        }

        return ans;
    }
}