class Solution {
public:
    string XXX(int n) {
        if(n==1) return "1";
        string str=XXX(n-1);
        string ans="";
        int count=1;
        for(int i=0;i<str.length();i++)
        {
            if(str[i+1]==str[i])
            {
                count++;
            }
            else
            {
                ans+=to_string(count)+str[i];
                count=1;
            }
        }
        return ans;
    }
};

