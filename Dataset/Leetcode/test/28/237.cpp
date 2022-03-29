 class Solution {
public:
    int XXX(string haystack, string needle) {
        int len1=haystack.size();
        int len2=needle.size();
        if(needle.empty()) return 0;
        int i=0,j=0;
        for(i =0;i<len1;)
        {
	     if(haystack[i+j] == needle[j])
            {
                ++j;
                if(j == len2) return i;
            }
            else
            {
                ++i;
                j=0;
            }
        }
        return -1;
    }
};

