class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> cnt = new HashMap<>();
        HashMap<Character, Integer> wnd = new HashMap<>();

        for(char c: t.toCharArray()){
            cnt.put(c, cnt.getOrDefault(c,0)+1);
        }

        int need = cnt.size();
        int have = 0;
        int left = 0;
        int start = 0;
        int minL = Integer.MAX_VALUE;

        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);

            wnd.put(c, wnd.getOrDefault(c, 0)+1);

            if(cnt.containsKey(c) && cnt.get(c).intValue() == wnd.get(c).intValue()){
                have++;
            }

            while(need == have){
                if((right - left + 1) < minL){
                    minL = right - left + 1;
                    start = left;
                }

                char l = s.charAt(left);
                wnd.put(l, wnd.get(l)-1);
                if(cnt.containsKey(l) && wnd.get(l) < cnt.get(l)){
                    have--;
                }

                left++;

            }
        }

        return minL == Integer.MAX_VALUE ? "" : s.substring(start, start+minL);
    }
}