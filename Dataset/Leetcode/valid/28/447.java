 class Solution {
    public int XXX(String haystack, String needle) {
        int l1=haystack.length();
        int l2=needle.length();
        if(l2==0) return 0;
        if(l1==0) return -1;
        for(int i = 0;i<l1-l2+1;i++){
            if(haystack.substring(i,i+l2).equals(needle)){
                return i;
            }
        }
        return -1;

    }
}

