 class Solution {
    public int XXX(String haystack, String needle) {
        if(needle.length()==0&&haystack.length()==0) return 0;
        if(needle.length()==0) return 0;
        if(haystack.length()==0) return -1;
        int[] next = new int[needle.length()];
        next[0] = -1;
        if(needle.length()>1) next[1] = 0;
        for (int k = 2; k < next.length; k++) {
            //
            next[k] = getMaxPrePost(needle.substring(0, k));
        }
        int index = 0;
        int i = 0;
        int j = 0;
        while(i+j<haystack.length()) {
            if(haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
                if(j==needle.length()) return i;
            } else {
                i+=j-next[j];
                j = next[j];
                if(j==-1) j=0;
            }
        }
        return -1;
    }

    private int getMaxPrePost(String str) {
        int max = str.length() - 1;
        while (max > 0) {
            if (str.substring(0, max).equals(str.substring(str.length() - max, str.length()))) {
                return max;
            }
            max--;
        }
        return 0;
    }
}

