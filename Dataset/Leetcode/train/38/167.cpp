class Solution {
public:
    string XXX(int n) {
        if(n==1)
            return "1";
        if(n==2)
            return "11";
        string s1="11",s2;
        for(int i=3;i<=n;i++)
        {
            int cnt=1;
            for(int j=1;j<s1.size();j++)
            {
                if(s1[j]==s1[j-1])
                    cnt++;
                else
                {
                    s2+=cnt+'0';
                    s2+=s1[j-1];
                    cnt=1;
                }
                if(j==s1.size()-1)
                {
                    s2+=cnt+'0';
                    s2+=s1[j];
                }
            }
            s1=s2;
            s2="";
        }
        return s1;
    }
};

