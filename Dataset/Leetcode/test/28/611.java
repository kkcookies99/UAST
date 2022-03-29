 class Solution {
    public int XXX(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        int[] next = findNext(needle);
        int n = haystack.length();
        for(int i=0,j=0;i<n;i++){
            while(j > 0 && haystack.charAt(i) != needle.charAt(j)){
                j = next[j-1];
            }
            if(haystack.charAt(i) == needle.charAt(j)){
                j++;
            }
            if(j == needle.length()) return i-j+1;
        }
        return -1;
    }
    public int[] findNext(String needle){
        int l = needle.length();
        int[] next = new int[l];
        int j = 0;
        for(int i=1;i<l;i++){
            while(j > 0 && needle.charAt(i) != needle.charAt(j)){
                j = next[j-1];
            }
            if(needle.charAt(i) == needle.charAt(j)) j++;
            next[i] = j;
        }
        return next;
    }
}

