 class Solution {
public:
    string XXX(string s, int numRows) {
        if (numRows < 2)
            return s;
        int nJump = (numRows - 2) * 2 + 2;
        string ret;
        for (int i = 0; i < s.size(); i += nJump)
        {
            ret.push_back(s[i]);
        }
        int cur = 1;
        for (; nJump - 2 * cur >= 2; ++cur)
        {
            for (int i = cur; i < s.size(); i += nJump)
            {
                ret.push_back(s[i]);
                if (i + nJump - 2 * cur >= s.size())
                    break;
                ret.push_back(s[i + nJump - 2 * cur]);
            }
        }
        
        for (int i = cur; i < s.size(); i += nJump)
        {
            ret.push_back(s[i]);
        }
        return ret;
    }
};

