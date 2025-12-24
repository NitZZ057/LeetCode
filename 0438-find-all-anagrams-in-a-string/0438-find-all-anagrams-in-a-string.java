class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int m = p.length();
        List<Integer> ans = new ArrayList<Integer>();

        if(s.length() < p.length()){
            return ans;
        }

        int[] schar = new int[26];
        int[] pchar = new int[26];

        for(int i = 0; i < p.length(); i++){
            schar[s.charAt(i)-'a']++;
            pchar[p.charAt(i)-'a']++;
        }

        if(Arrays.equals(schar, pchar)) ans.add(0);

        for(int i = m; i < s.length(); i++){
            schar[s.charAt(i)-'a']++;
            schar[s.charAt(i-m)-'a']--;

            if(Arrays.equals(schar, pchar)) ans.add(i-m+1);
        }

        return ans;
    }
}