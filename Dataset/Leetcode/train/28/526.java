 class Solution {
    public int XXX(String haystack, String needle) {
        if(needle==null||"".equals(needle)){
            return 0;
        }
        int len = needle.length();
        if(len>haystack.length()||"".equals(haystack)||null==haystack){
            return -1;
        }
        for(int i=0;i<=haystack.length()-len;i++){
            if(haystack.substring(i,i+len).equals(needle)){
                return i;
            }

        }
        return -1;
    }
}

