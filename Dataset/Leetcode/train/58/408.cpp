class Solution {
public:
    int XXX(string s) {
    int size = s.size();
    int len = 0;
    for (int i = size - 1; i >= 0; i--) {
        if (s[i] == ' ') {
            if (len) return len;
        }
        else
            len++;
    }
    return len;
    }
};

