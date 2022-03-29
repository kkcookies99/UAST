 class Solution {
public:
    int XXX(string s) {
        int l = 0;  //窗口[l,r]
        int r = -1;
        int length = 0;
        int temp[256] = {0};
        while (r + 1 < s.size()) {
            while (temp[s[r + 1]] != 0) {
                temp[s[l++]] = 0;
            }
            temp[s[++r]] = 1;
            length = max(length, r - l + 1);
        }
        return length;
    }
};

