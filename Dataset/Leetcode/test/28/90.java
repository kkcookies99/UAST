 class Solution {
    public int XXX(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }
        for (int i = 0; i <= haystack.length()-needle.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)){
                int j = 0;
                int pre = i;
                for (; j < needle.length(); j++) {
                    if(haystack.charAt(i) != needle.charAt(j)){
                        i = i-2;
                        break;
                    }
                    i++;
                }
                if(j == needle.length()){
                    return pre;
                }
            }
        }
        return -1;
    }
}

