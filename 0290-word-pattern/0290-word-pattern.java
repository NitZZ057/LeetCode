class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] str = s.split(" ");

        if(str.length!=pattern.length()) return false;

        for(int i = 0; i < pattern.length(); i++){
            char ch = pattern.charAt(i);
            String ss = str[i];

            if(map.containsKey(ch)){
                if(!map.get(ch).equals(ss)){
                    return false;
                }
            }else{
                if(map.containsValue(ss)){
                    return false;
                }

                map.put(ch,ss);
            }
        }

        return true;
    }
}