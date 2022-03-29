 class Solution {
public:
    int XXX(string s) {
		int i = s.length(), res = 0;
        while(s[--i] == ' ');
        while(i >= 0 && s[i] != ' ') i--, res++;
        return res;
    }
};

