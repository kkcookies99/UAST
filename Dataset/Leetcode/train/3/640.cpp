 class Solution {
public:
    int XXX(string s) {
        if(s=="")
            return 0;
        int n = s.length();
        int max_len=0;
        for(int i=0, j=0;j<n;j++)
        {
            for(int k=i;k<j;k++)
            {
                if(s[k]==s[j])
                {
                    i = k+1;
                    break;
                }
            }
            if(max_len<j-i+1)
            {
                max_len = j-i+1;
            }
                     
        }
        return max_len;
    }

