 class Solution {
public:
    int XXX(string s) {
        int ans = 0;
        for (auto i = s.rbegin(); i < s.rend(); ++i) {
            if (*i == ' ' && !ans) continue;
            if (*i == ' ' && ans) break;
            ++ans;
        }
        return ans;
    }
};

