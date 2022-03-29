 class Solution {
public:
    int XXX(string s) {
        int k = 0;
        while(k < s.size() && s[k] == ' ') k++;
        if(k == s.size()) return 0;

        int flag = 1;
        if(s[k] == '-') flag = -1, k++;
        else if(s[k] == '+') flag = 1, k++;


        int res = 0;
        while(k < s.size() && isdigit(s[k])) {
            int x = s[k] - '0';
            if(flag > 0 && res > (INT_MAX - x)/10) return INT_MAX;
            if(flag < 0 && -res < (INT_MIN + x)/10) return INT_MIN;
            if(-res*10-x == INT_MIN) return INT_MIN; // '-2147483648' 特判
            res = res*10 + x;
            k++;
            if(res > INT_MAX) return INT_MAX;
        }
        res *= flag;
        return res;
    }
};

