 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(needle=="")
        {
            return 0;
        }
        for(int i=0;i<haystack.size();i++)
        {
            if(haystack[i]==needle[0])
            {
                for(int j=0;j<needle.size();j++)
                {
                    if(haystack[i+j]!=needle[j])
                    {
                        break;
                    }
                    if(j==needle.size()-1)
                    {return i;}
                }
            }
            
        }
        return -1;

    }
};

