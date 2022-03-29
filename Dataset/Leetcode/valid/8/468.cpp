 class Solution {
public:
    bool isNumber(char c) {
        return '0' <= c && c <= '9';
    }
    int XXX(string s) {
        int i = 0, n = s.size(), signal = 1;
        long long number = 0;
        while(i < n && s[i] == ' ') {
            ++i;
        }
        if(i == n) return 0;
        else if(s[i] == '-') signal = -1, ++i;
        else if(s[i] == '+') signal = 1, ++i;
        while(i < n) {
            if(isNumber(s[i])){
                number = number * 10 + s[i] - '0';
            } else {
                break;
            }
            if (number * signal < -(1ll<<31)) return -(1ll<<31);
            else if (number * signal > (1ll<<31) - 1) return (1ll<<31) - 1;
            i++;
        }
        number = number * signal;
        return number;
    }
};

