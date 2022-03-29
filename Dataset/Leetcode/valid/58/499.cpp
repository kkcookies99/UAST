class Solution {
public:
    int XXX(string s) {
        int i = s.size() - 1;
        while(s[i] == ' ') --i;
        int p = i;
        for (; i > -1 ;--i)
            if (s[i] == ' ') break;
        return p - i;
    }
};

