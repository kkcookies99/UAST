 class Solution {
public:
    int XXX(string s) {
        int res = 0;
        int pos = 0;
        while (pos < s.length() - 1) {
            res += Combine(s, pos);
        }

        if (pos == s.length() - 1) {
            res += charMap(s[pos]);
        }

        return res;
    }

private:
    int charMap(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    int Combine(string &s, int &pos) {
        if (s[pos] == 'I' && s[pos + 1] == 'V') {pos += 2; return 4;}
        if (s[pos] == 'I' && s[pos + 1] == 'X') {pos += 2; return 9;}
        if (s[pos] == 'X' && s[pos + 1] == 'L') {pos += 2; return 40;}
        if (s[pos] == 'X' && s[pos + 1] == 'C') {pos += 2; return 90;}
        if (s[pos] == 'C' && s[pos + 1] == 'D') {pos += 2; return 400;}
        if (s[pos] == 'C' && s[pos + 1] == 'M') {pos += 2; return 900;}
        return charMap(s[pos++]);
    }
};

