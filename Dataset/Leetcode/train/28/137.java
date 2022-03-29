 class Solution {
    public int XXX(String haystack, String needle) {
        if(!haystack.contains(needle)){
            return -1;
        }
        for (int i = 0; i < haystack.length(); i ++){
            if(haystack.substring(i,i+needle.length()).equals(needle)){
                return i;
            }
        }
        return 0;
        // int needlel = needle.length();
        // if(needlel == 0){
        //     return 0;
        // }
        // for (int i = 0; i < haystack.length()-needlel + 1; i ++){
        //     if(haystack.substring(i,i+needlel).equals(needle)){
        //         return i;
        //     }
        // }
        // return -1;
    }
}

