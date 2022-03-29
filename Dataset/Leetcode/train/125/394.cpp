 class Solution {
public:
    bool XXX(string s) {
        int l = 0, r = s.size() - 1;
        for (int i = 0; i < s.size(); i++) {
            if (s[i] <= 'Z' && s[i] >= 'A') {
                s[i] = 'a' + s[i] - 'A';
            }
        }
        while (l < r) {
            while (l < s.size() && !((s[l] >= 'a' && s[l] <= 'z') || (s[l] >= '0' && s[l] <= '9'))){
                l++;
            }
            while (r >= 0 &&  !((s[r] >= 'a' && s[r] <= 'z') || (s[r] >= '0' && s[r] <= '9'))){
                r--;
            }
            if (l > r) {
                return true;
            }
            if (s[l] != s[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
};

