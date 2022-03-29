 class Solution {
public:
    int XXX(string haystack, string needle) {
        int n=haystack.size();
        int m=needle.size();
        if(m==0)return 0;
        int count=-1;
        int i,j=0;
        for(i=0;i<n;i++)
        {
            if(needle[j]==haystack[i])
            {
                count=i;
                i++;
                j++;
                while(i<n&&j<m)
                {
                    if(haystack[i]==needle[j])
                    {
                        i++;
                        j++;
                    }
                    else 
                    {
                        j=0;
                        i=count;
                        count=-1;
                        break;
                    }
                }
                if(j<m)count=-1;
            }
        }
        return count;
    }
};

