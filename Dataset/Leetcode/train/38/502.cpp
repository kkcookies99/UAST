 class Solution {
public:
    string rec(const string &s) {
        int cnt = 0;
        char cur = '#';
        string res;
        for(auto &c : s) {
            if(c != cur) {
                if(cur != '#') res += to_string(cnt) + cur;
                cur = c;
                cnt = 0;
            }
            cnt ++;
        }
        if(cur != '#') res += to_string(cnt) + cur;
        return res;
    }
    string XXX(int n) {
        string res = "1";
        while(-- n) {
            res = rec(res);
        }
        return res;
    }
};

