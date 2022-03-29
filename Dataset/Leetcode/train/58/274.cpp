 class Solution {
public:
    int XXX(string s) {
        int len = s.size();
        int pre = len - 1;
        while (pre >= 0 && s[pre] == ' ') pre--;
        int p = pre - 1;
        while (p >= 0 && s[p] != ' ') p--;
        return pre - p;
    }
};

