 class Solution {
    public int XXX(String haystack, String needle) {
        char[] str1=haystack.toCharArray();
        char[] str2=needle.toCharArray();
        
        int i=0,j=0,k=0;
        if(str2.length==0)
            return 0;
        
        while(i<str1.length&&j<str2.length){
                if(str1[i]!=str2[j]){
                    i=i-j+1;
                    j=0;
                }
                else{
                    i++;
                    j++;
                }
                if(j==str2.length)
                    return i-j;
        }
        return -1;
    }
}

