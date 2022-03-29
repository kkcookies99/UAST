 class Solution {
public:
    bool XXX(string s) {
        int l = 0, r = s.size() - 1;
        while(l < r) {
            if(!(('a' <= s[l] && s[l] <= 'z') || ('A' <= s[l] && s[l] <= 'Z') || ('0' <= s[l] && s[l] <= '9'))) {
                ++l;
                continue;
            }
            if(!(('a' <= s[r] && s[r] <= 'z') || ('A' <= s[r] && s[r] <= 'Z') || ('0' <= s[r] && s[r] <= '9'))) {
                --r;
                continue;
            }
            if((('a' <= s[l] && s[l] <= 'z') || ('A' <= s[l] && s[l] <= 'Z')) && (('a' <= s[r] && s[r] <= 'z') || ('A' <= s[r] && s[r] <= 'Z'))) {
                if(s[l] == s[r] || s[l] + 'A' - 'a' == s[r] || s[l] + 'a' - 'A' == s[r])
                    ++l, --r;
                else return false;
            }
            else if(s[l] == s[r]) ++l, --r;
            else return false;
        }
        return true;
    }
};

