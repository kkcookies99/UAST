 class Solution {
public:
    int XXX(string s) {
        int len = 0, start = 0, end = 0;
        int state[128];
        memset(state, -1, sizeof(state));

        for (end = 0; end < s.size(); end++) {
            if (state[s[end]] >= start) {
                start = state[s[end]] + 1;
            }
            state[s[end]] = end;
            len = (len < end - start + 1) ? (end - start + 1) : len;
        }
        return len;
    }
};

