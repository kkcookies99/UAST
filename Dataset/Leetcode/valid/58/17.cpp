 class Solution {
public:
    int XXX(string s) {
        int i = s.size() - 1, len = 0;
        while (s[i] == ' ') i--;
        while (i >= 0) {
            if (s[i] == ' ') break;
            len++;
            i--;
        }      
        return len;
    }
};

