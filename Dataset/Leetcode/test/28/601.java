 class Solution {
    public int XXX(String haystack, String needle) {
        int len = needle.length(),haylen = haystack.length();
        if(len==0) return 0;
        for(int i=0;i<haylen;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(i+len>haylen) return -1;  //后面的长度小于len,不足以进行切分
                String str = haystack.substring(i,i+len);
                if(str.equals(needle)) return i;
            }
        }
        return -1;
    }
}

