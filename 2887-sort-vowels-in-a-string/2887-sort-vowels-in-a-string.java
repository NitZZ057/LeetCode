class Solution {
    public String sortVowels(String s) {
        String vowels = "AEIOUaeiou";
        int[] count = new int[10];
        int pointer = 0;
        String ans = "";

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int ind = vowels.indexOf(c);
            if(ind!=-1){
                count[ind] = count[ind]+1;
            }
        }

         for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(vowels.indexOf(c)!=-1){
                while(pointer < 10 && count[pointer]==0){
                    pointer++;
                }

                if(pointer < 10){
                    ans = ans + vowels.charAt(pointer);
                    count[pointer] = count[pointer] - 1;
                }
            }else{
                ans = ans + c;
            }
        }

        return ans;
    }
}