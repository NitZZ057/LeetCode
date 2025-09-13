class Solution {
    public int maxFreqSum(String s) {
        int[] f1 = new int[26];
        int[] f2 = new int[26];

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if("aeiou".indexOf(ch)!=-1){
                f1[ch-'a']++;
            }else{
                f2[ch-'a']++;
            }
        }

        int max1 = 0, max2 = 0;
        for(int i = 0; i < 26; i++){
            max1 = Math.max(max1,f1[i]);
            max2 = Math.max(max2,f2[i]);
        }

        return max1+max2;
    }
}