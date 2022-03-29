 class Solution {
public:
    int XXX(string s) {
        int n = s.length();
        bool flag = false;
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (!flag && s[i] != ' ') {
                flag = true;
                ans++;
            } else if (flag) {
                if (s[i] != ' ') ans++;
                else return ans;
            }
        }
        return ans;
    }
};

