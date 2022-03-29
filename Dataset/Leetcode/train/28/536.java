 class Solution {
    public int XXX(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
        for(int i=0;i+needle.length()-1<haystack.length();i++){
            int index = i,right = 0;
            if(haystack.charAt(i) == needle.charAt(right)){
                while(index < haystack.length() && right < needle.length() && haystack.charAt(index) == needle.charAt(right)){
                    index++;
                    right++;
                }
                if(right == needle.length()){
                    return i;
                }
            }
            right = 0;
        }
        return -1;
    }
}

