 class Solution {
public:
    int XXX(string haystack, string needle) 
    {
        int l1 = haystack.size(), l2 = needle.size();
        if(l2 == 0) return 0;

        if(l1 < l2) return -1;

        for(int i = 0; i < l1; i++)
        {
            if(haystack[i] == needle[0])
            {
                for(int j = 0; j < l2; j++)
                {
                    if(i+j >= l1 || haystack[i+j] != needle[j])
                    {
                        break;
                    }
                    if(j == l2-1) return i;
                }
            }
        }

        return -1;
    }
};

