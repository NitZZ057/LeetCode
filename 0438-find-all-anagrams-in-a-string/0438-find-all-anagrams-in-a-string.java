class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pf = new int[26];
        int[] sf = new int[26];

        List<Integer> ans = new ArrayList<>();

        int need = 0;
        int have = 0;
        int start = 0;
        int end = 0;

        for(int i = 0; i < p.length(); i++){
            if(pf[p.charAt(i)-'a']==0){
                need++;
            }
            pf[p.charAt(i)-'a']++;
        }

        while(end<s.length()){
            char ch = s.charAt(end);
            sf[ch-'a']++;

            if(sf[ch-'a']==pf[ch-'a']){
                have++;
            }

            end++;

            while(end-start > p.length()){
                char lch = s.charAt(start);

                if(sf[lch-'a']==pf[lch-'a']){
                    have--;
                }
                sf[lch-'a']--;
                start++;
            }

            if(end-start == p.length() && have==need){
                ans.add(start);
            }
        }


        return ans;

    }
}