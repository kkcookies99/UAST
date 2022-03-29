 class Solution {
public:
    int XXX(string s) {
        int ans, tmp = 0;
        for (auto c : s) {
            if (c == ' ' && tmp) {
                ans = tmp;
                tmp = 0;
            } else if (c != ' ') {
                tmp += 1;
            }
        }
        return tmp ? tmp : ans;
    }
};

