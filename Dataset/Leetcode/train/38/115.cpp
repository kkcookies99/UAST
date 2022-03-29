class Solution {
public:
    string XXX(int n) {
        if (n == 1) return "1";    
        return say(XXX(n - 1));
    }

    string say(const string &s) {
        string ret;   
        int count = 1, length = s.size();
        char c = s[0];     
        for (int i = 1; i < length; ++i) {
            if (c == s[i]) {
                ++count;
            } else {
                ret += char('0' + count);
                ret += c;
                c = s[i];
                count = 1;
            }
        }
        ret += char('0' + count);
        ret += c;    
        return ret;
    }
};

