 class Solution {
    // 判断字符串s的[x, y]区间是否是回文的
    static inline bool isPalindrome(string &s, int x, int y) {
        while(x <= y) {
            if(s[x] != s[y]) {
                return false;
            }
            x++;
            y--;
        }
        return true;
    }

public:
    string XXX(string s) {
        const int size = s.size();
        for(int len = size; len >= 1; len--) {
            for(int i = 0; i < size-len+1; i++) {
                if(isPalindrome(s, i, i+len-1)) {
                    return s.substr(i, len);
                }
            }
        }
        return "";
    }
};

