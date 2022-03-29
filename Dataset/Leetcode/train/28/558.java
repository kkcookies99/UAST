 class Solution {
    public int XXX(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        int i=0;
        for(i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.charAt(i)==needle.charAt(0))
            {
                if(needle.length()==1)
                    return i;
                for(int j=i+1,k=1;k<needle.length();j++,k++){
                    if(haystack.charAt(j)!=needle.charAt(k)){
                        break;
                    }
                    if(k==needle.length()-1)
                    {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}


