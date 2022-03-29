 class Solution {
    public int XXX(String haystack, String needle) {
        int m=haystack.length(),n=needle.length();
        for(int i=0;i<m-n+1;i++){
            if(haystack.substring(i,n+i).equals(needle)){
                return i;        
            }
        }
    return -1;
    }
}

