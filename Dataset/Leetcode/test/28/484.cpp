 class Solution {
public:
    int XXX(string haystack, string needle) {

        if(needle.length()<1)
        return 0 ;

        int len   = needle.length();
        int L     = haystack.length();
        int pos   = 0;
        bool falg = false;

        while(pos<=L-len)
        {
            if(needle[0]==haystack[pos])
            {
                falg =true;
                for(int i = 1; i<len;i++)
                {
                    if(haystack[pos+i]!=needle[i])
                    falg =false;
                }
            }
            pos++;

            if(falg)
            return pos-1;
        }
        return -1;
    }
};

