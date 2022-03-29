class Solution {
public:
    int XXX(string s) {
        int res = 0;
        for(int i = 0; i < s.size(); ++i) {
            if(s[i] == 'M') res += 1000;
            else if(s[i] == 'D') res += 500;
            else if(s[i] == 'L') res += 50;
            else if(s[i] == 'V') res += 5;
            else if(s[i] == 'C' && i+1 < s.size() && (s[i+1] == 'D' || s[i+1] == 'M')) res -= 100;
            else if(s[i] == 'C') res += 100;
            else if(s[i] == 'X' && i+1 < s.size() && (s[i+1] == 'L' || s[i+1] == 'C')) res -= 10;
            else if(s[i] == 'X') res += 10;
            else if(s[i] == 'I' && i+1 < s.size() && (s[i+1] == 'V' || s[i+1] == 'X')) res -= 1;
            else if(s[i] == 'I') res += 1;
        }
        return res;
    }
};

