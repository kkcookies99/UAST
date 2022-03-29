 class Solution {
public:
    int XXX(string s) {
        int res = 0, i = 0;
        while (i < s.size()) {
            if (s[i] == 'M') {
                int tmp = 0;
                while (i < s.size() && s[i] == 'M') {
                    tmp += 1;
                    i++;
                }
                res += tmp * 1000;
            } else if (s[i] == 'D') {
                res += 500;
                i++;
            } else if (s[i] == 'C') {
                if (i + 1 < s.size() && s[i + 1] == 'D') {
                    res += 400;
                    i += 2;
                } else if (i + 1 < s.size() && s[i + 1] == 'M') {
                    res += 900;
                    i += 2;
                } else {
                    int tmp = 0;
                    while (i < s.size() && s[i] == 'C') {
                        tmp += 1;
                        i++;
                    }
                    res += tmp * 100;
                }
            } else if (s[i] == 'L') {
                res += 50;
                i++;
            } else if (s[i] == 'X') {
                if (i + 1 < s.size() && s[i + 1] == 'L') {
                    res += 40;
                    i += 2;
                } else if (i + 1 < s.size() && s[i + 1] == 'C') {
                    res += 90;
                    i += 2;
                } else {
                    int tmp = 0;
                    while (i < s.size() && s[i] == 'X') {
                        tmp += 1;
                        i++;
                    }
                    res += tmp * 10;
                }
            } else if (s[i] == 'V') {
                res += 5;
                i++;
            } else {
                if (i + 1 < s.size() && s[i + 1] == 'V') {
                    res += 4;
                    i += 2;
                } else if (i + 1 < s.size() && s[i + 1] == 'X') {
                    res += 9;
                    i += 2;
                } else {
                    int tmp = 0;
                    while (i < s.size() && s[i] == 'I') {
                        tmp += 1;
                        i++;
                    }
                    res += tmp * 1;
                }
            }
        }
        return res;
    }
};

