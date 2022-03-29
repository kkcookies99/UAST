 class Solution {
public:
    bool XXX(string s) {
        int cnt = 'A' - 'a';
        int left = 0, right = s.size() - 1;
        char c1, c2;
        while (left < right) {
            c1 = s[left];
            c2 = s[right];
            if (!(c1 >= 'A' && c1 <= 'Z' || c1 >= 'a' && c1 <= 'z' || c1 >= '0' && c1 <= '9')) {
                left++;
                continue;
            }
            if (!(c2 >= 'A' && c2 <= 'Z' || c2 >= 'a' && c2 <= 'z' || c2 >= '0' && c2 <= '9')) {
                right--;
                continue;
            }
            if (c1 >= 'A' && c1 <= 'Z')
                c1 -= cnt;
            if (c2 >= 'A' && c2 <= 'Z')
                c2 -= cnt;
            if(c1 != c2)
                return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    }
};

