 class Solution {
public:
    bool XXX(string s) {
        if(s.empty())
            return true;
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(!isdigit(s[i])&&!isalpha(s[i]))//过滤其他字符
            {
                i++;
                continue;
            }
            if(!isdigit(s[j])&&!isalpha(s[j]))
            {
                j--;
                continue;
            }
            if(abs(s[i]-s[j])==32&&(!isalpha(s[i])||!isalpha(s[j])))
            {
                return false;
            }
            if(s[i]!=s[j]&&abs(s[i]-s[j])!=32)
            {
                return false;
            }
            i++;j--;
        }
        return true;
    }
};

