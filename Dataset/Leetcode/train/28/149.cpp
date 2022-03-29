 class Solution {
public:
    int XXX(string haystack, string needle) {
        int i = 0;
        int j = 0;
        if(haystack == needle)
            return 0;
        for(;i < haystack.length();i++)
        {
            while(i < haystack.length() && j < needle.length() && haystack[i] == needle[j])
            {
                i++;
                j++;
            }
            if(j == needle.length())
                return i - j;
            else
            {
                i = i - j;
                j = 0;
            }
        }
        return -1;
    }
};

