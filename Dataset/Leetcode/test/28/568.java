 class Solution {
    public int XXX(String haystack, String needle) {
       if (needle.length() == 0) {
            return 0;
        }
        int n = haystack.length();
        int m = needle.length();
        for (int i=0;i+m-1<n;i++){
            String sub = haystack.substring(i, i + m);
            if(sub.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}

