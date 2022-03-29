 class Solution {
public:
    char fun(char c) {
        char c1 = ' ';
        if(c <= 'z' && c >= 'a')  c1 = c;
        else if(c <= 'Z' && c >= 'A') c1 = c - 'A' + 'a';
        else if(c <= '9' && c >= '0') c1 = c;
        return c1;
    }
    bool XXX(string s) {
        int l = 0, r = s.length() - 1;
        while(l < r) {
            char c1 = fun(s[l]), c2 = fun(s[r]);
            if(c1 == ' ') {l++; continue;}
            if(c2 == ' ') {r--; continue;}
            l++;r--;
            if(c1 != c2) return false;
        }
        return true;
    }
};

