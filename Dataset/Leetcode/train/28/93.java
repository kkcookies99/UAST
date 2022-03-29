 class Solution {
    public int XXX(String haystack, String needle) {
        if(needle.length()==0) return 0;
        if(haystack.length()==0) return -1;
        int i=0;
        int k=needle.length();
        while(i+k<=haystack.length()){
            if(haystack.substring(i,i+k).equals(needle)){
                return i;
            }else{
                i++;
            }
        }
        return -1;
    }
}

