 class Solution {
    public int XXX(String haystack, String needle) {
        if(needle.equals("")) return 0;
        int result=-1;
        int haystackLen=haystack.length();
        int needleLen=needle.length();
        int max=haystackLen-needleLen;
        if(max<0) return -1;
        char first=needle.charAt(0);
        outer:
        for(int i=0;i<=max;i++){
            if(first!=haystack.charAt(i)) continue;
            for(int j=1;j<needleLen;j++){
                char needleC=needle.charAt(j);
                char c=haystack.charAt(i+j);
                if (needleC != c) {
                    continue outer;
                }
            }
            return i;
        }
        return result;
    
    }
    

}

