class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length-1];

        int range = Math.min(first.length(), last.length());

        for(int i = 0; i < range; i++){
            if(first.charAt(i)!=last.charAt(i)){
                return s;
            }

            s += first.charAt(i);
        }

        return s;
    }
}