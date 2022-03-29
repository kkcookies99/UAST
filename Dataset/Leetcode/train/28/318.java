 class Solution {
    public int XXX(String haystack, String needle) {
        int i=0,j=0;
        while(i<haystack.length()&&j<needle.length()){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }else{
                i-=j-1;
                j=0;
            }
        }
        if(j==needle.length()) return i-j;
        return -1;
    }
}

