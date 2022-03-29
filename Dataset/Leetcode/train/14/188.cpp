 class Solution {
public:
    string XXX(vector<string>& strs) 
    {
        int n=strs.size();
        if(n==1)
        return strs[0];
        sort(begin(strs),end(strs));
        //求出首尾字符串前缀即可
        string s1=strs[0];
        string s2=strs[n-1];
        string ans;
        for(int i=0;i<min(s1.size(),s2.size());++i)
        {
            if(s1[i]==s2[i])
            ans+=s1[i];
            else
            break;
        }
        return ans;
    }
};

