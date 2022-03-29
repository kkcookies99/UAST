class Solution {
public:
    bool XXX(int x) 
    {
        if(x<0)
            return false;
        stringstream ss;
        ss<<x;
        string s=ss.str();
        for(int i=0;i<s.size()/2;i++)
        {
            if(s[i]!=s[s.size()-1-i])
                return false;
        }
        return true;
    }
};

