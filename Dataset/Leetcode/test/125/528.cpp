 class Solution {
public:
    bool XXX(string s) {
        int st = 0, en = s.size() - 1;
        while (st < en) {
            for (; st < en && isNotAlp(s, st) && isNotDig(s, st); st ++ );
            for (; st < en && isNotAlp(s, en) && isNotDig(s, en); en -- );
            if (s[st] == s[en] || isNotDig(s, st) && isNotDig(s, en) && abs(s[st] - s[en]) == 32)
                st ++ , en -- ;
            else return false;
        }
        return true;
    }

    inline bool isNotAlp(string& s, int idx) {
        return s[idx] < 'A' || (s[idx] > 'Z' && s[idx] < 'a') || s[idx] > 'z';
    }

    inline bool isNotDig(string& s, int idx) {
        return s[idx] < '0' || s[idx] > '9';
    }
};

