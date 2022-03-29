 class Solution {
public:
    bool XXX(string s) {
        int i,j=0;
        for(i=0;i<s.size();i++)
        {
            if((s[i]>='0'&&s[i]<='9')||(s[i]>='a'&&s[i]<='z')||(s[i]>='A'&&s[i]<='Z'))
            {
            if(s[i]>='A'&&s[i]<='Z')
            s[i]+=32;
            s[j++]=s[i];    
            }
        }
        stack <char> stk;
        for(i=0;i<j/2;i++)
        stk.push(s[i]);
        if(j%2==1)
        ++i;
        for(;i<j;++i)
        {
            if(s[i]!=stk.top())
            return false;
            else
            stk.pop();
        }
        if(stk.empty())
        return true;
        else
        return false;
    }
};

