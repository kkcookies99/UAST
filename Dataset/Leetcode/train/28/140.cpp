 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(needle.length()==0)
        {
            return 0;
        }
        int i=0,j=0;
        while(i<haystack.length()&&j<needle.length())
        {
            if(haystack[i]==needle[j])
            {
                i++;
                j++;
            }
            else
            {
                i=i-j+1;
                j=0;
            }
        }
        if(j>=needle.length())
        {
            return i-j;
        }
        else
        {
            return -1;
        }
    }
};

