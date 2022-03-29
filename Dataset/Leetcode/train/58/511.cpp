class Solution {
public:
    int XXX(string s) {
        int cnt = 0, r = s.size()-1;
        while (r >= 0 && s[r] == ' ')   --r;
        while (r >= 0 && s[r--] != ' ')   ++cnt;
        return cnt;
    }
};

