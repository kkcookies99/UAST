 class Solution {
    public int XXX(String haystack, String needle) {
        int a = haystack.length();
        int b = needle.length();
        for(int c = 0;c<a-b+1;c++){
            if(haystack.substring(c,c+b).equals(needle)){
                return c;
            }
        }
        return -1;
    }
}

