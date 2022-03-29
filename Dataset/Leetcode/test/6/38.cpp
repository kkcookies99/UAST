 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows==1)
            return s;
        int step=numRows*2-2;
        string ans="";
        for(int i=0;i<s.length();i+=step)
            ans+=s[i];
        for(int i=1;i<numRows-1;i++)
        {
            for(int j=i;j<s.length();)
            {
                ans+=s[j];
                j+=((numRows-i)*2-2);

                if(j<s.length())
                {
                    ans+=s[j];
                    j+=2*i;
                }
            }
        }
        for(int i=numRows-1;i<s.length();i+=step)
            ans+=s[i];
        return ans;
    }
};

