 class Solution {
public:
    int XXX(string s) {
        bool flag = false;
        auto ans = 0;
        for (int i = s.length() - 1; i >= 0; --i) {
            if (s[i] != ' ') {
                flag = true;
                ans++;
            }

            if (flag && s[i] == ' ') {
                break;
            }
        }

        return ans;
    }
};

