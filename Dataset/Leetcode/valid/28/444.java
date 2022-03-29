 class Solution {
    public int XXX(String haystack, String needle) {
        int n1 = haystack.length();
        int n2 = needle.length();
        //考虑特殊情况，子串匹配长度为0
        if(needle.length() == 0){
            return 0;
        }

        for (int i = 0; i < n1-n2 +1; i++){
            if(haystack.substring(i,i+n2).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}

