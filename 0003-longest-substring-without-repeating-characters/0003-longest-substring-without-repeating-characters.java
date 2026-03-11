class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> set = new ArrayList<>();
        int l = 0;

        for(int i = 0; i < s.length(); i++){
            while(set.contains(s.charAt(i))){
                set.remove(0);
            }

            set.add(s.charAt(i));
            l = Math.max(l,set.size());
        }

        return l;
    }
}