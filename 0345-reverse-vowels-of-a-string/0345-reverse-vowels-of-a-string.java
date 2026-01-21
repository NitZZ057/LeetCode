class Solution {
    public String reverseVowels(String s) {
        String vowels = "AEIOUaeiou";
        
        String vocc = "";

        for(int i = 0; i < s.length(); i++){
            if(vowels.contains(s.substring(i,i+1))){
                vocc = vocc + s.charAt(i);
            }
        }

        int ind = vocc.length()-1;
        for(int i = 0; i < s.length(); i++)
        {
            if(vowels.contains(s.substring(i,i+1))){
                s = s.substring(0,i) + vocc.charAt(ind) + s.substring(i+1);
                ind--;
            }
        }

        return s;
    }
}