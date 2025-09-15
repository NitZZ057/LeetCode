class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;

        for(String s: words){
            boolean broken = false;
            for(char b: brokenLetters.toCharArray()){
                if(s.indexOf(b)!=-1){
                    broken = true;
                    break;
                }
            }
            if(!broken){
                count++;
            }
        }

        return count;
    }
}