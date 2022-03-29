 class Solution {
public:
    int XXX(string s) {
        int l = 0, r = 0, len = 0;
        int cnt[128] = { 0 };

        while (r < s.size()) {
            ++cnt[s[r]];
            while (cnt[s[r]] > 1)
                --cnt[s[l++]];   
            r++;
            len = r - l > len ? r - l : len;   
        }
        return len;
    }
};
