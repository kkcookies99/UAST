 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(needle.size() == 0)
        {
            return 0;
        }
        const int len = needle.size();
        for(int i=0;i<haystack.size();i++)
        {
            string temp = haystack.substr(i,len);
            if((haystack[i] == needle[0]) && (temp == needle))
            {
                return i;
            }
        }
        return -1;
    }
};

