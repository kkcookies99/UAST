 class Solution {
    public int XXX(String haystack, String needle) {
        if(needle.equals(""))
            return 0;
        int index1 = 0;
        int index2 = 0;
        for(int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) != needle.charAt(index2)) {
                index1++;
                i = index1 - 1;
                index2 = 0;
            } else {
                index2++;
                if(index2 == needle.length())
                    return index1;
            }
        }
        return -1;
    }
}

