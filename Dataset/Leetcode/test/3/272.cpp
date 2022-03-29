 class Solution {
public:
    int XXX(string s) {
        if (s.empty()) return 0;
        map<char, int> cnt;
        cnt[s[0]]++;
        int res = 1;
        int i = 0, j = 0;
        while (j + 1 < s.size()) {
            j++;
            if (++cnt[s[j]] == 2) {
                res = max(res, j - i);
                while (cnt[s[j]] == 2) {
                    cnt[s[i]]--;
                    i++;
                }
            } else {
                res = max(res, j - i + 1);
            }
        }
        return res;
    }
};

