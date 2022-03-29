 class Solution {
public:
    int XXX(string s) {
        int len = 0;
        for(auto it = s.rbegin(); it != s.rend(); it++)
        {
            auto c = *it;
            if (c == ' '){
                if (len > 0)
                {
                    break;
                }
            }
            else
            {
                len++;
            }
        }
        return len;
    }
};

