 class Solution {
public:
    bool XXX(string s) {
        int index=0;
        for(int i=0;i<s.length();i++)
        {
            if(isalnum(s[i]))
            {
                s[index]=tolower(s[i]);
                index++;
            }
        }
        for(int i=0;i<index/2;i++)
        {
            if(s[i]!=s[index-1-i])
            {
                return false;
            }
        }
        return true;
    }
};

