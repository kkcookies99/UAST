 class Solution {
public:
    int XXX(string s) {
        int ind[256];
        memset(ind, -1, sizeof(ind));
        int left = 0, right = 0;
        int ans = 0;
        for (; right < s.size(); ++right) {
            if (ind[s[right]] != -1) {
                while (left <= ind[s[right]]) {
                    ind[s[left++]] = -1;
                }
            }
            ind[s[right]] = right;
            ans = max(ans, right - left + 1);
        }
        return max(ans, right - left);
    }
};

