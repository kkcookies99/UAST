 class Solution {
    public int XXX(String haystack, String needle) {
        if(needle.length()==0) return 0;

        for(int i=0;i<haystack.length();i++){
            if(haystack.startsWith(needle, i)){
                return i;
            }
        }
        return -1;
    }
}```

