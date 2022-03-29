 class Solution {
public:
    int XXX(string s) {
        auto iter = s.rbegin();
        while(*iter == ' ')
            ++iter;
        int cnt = 0;
        while(*iter != ' ' && iter != s.rend())
        {
            ++cnt;
            ++iter;
        }
        return cnt;
    }
};

