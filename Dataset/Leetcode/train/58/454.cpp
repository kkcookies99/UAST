class Solution {
public:
    int XXX(string s) {
        int r = s.length();
        while(s[r - 1] == ' ') {
            r --;
        }
        int i = r;
        while(i > 0 && s[i - 1] != ' ') {
            i --;
        }
        // i == 0 || s[i - 1] == ' '
        return  r - i;
    }
};

