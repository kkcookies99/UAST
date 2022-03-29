 class Solution {
    public int XXX(String s) {
        String strs = "";
        int count = 0;
        for(char c : s.toCharArray()){
            if(strs.contains(c+"")){
                strs = strs.substring(strs.indexOf(c)+1, strs.length());
            }
            strs = strs + String.valueOf(c);
            if(count < strs.length()){
                count = strs.length();
            }
        }
        return count;
    }
}

