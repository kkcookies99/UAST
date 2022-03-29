class Solution {
public:
    string XXX(int n) {
        if (n == 1) return "1";
        return f(XXX(n - 1));
    }

    string f(string s){
        string ret;
        for (int i = 0 ; i < s.size();){
            int cnt = 0;
            char c = s[i];
            while (s[i] == c){
                ++cnt;
                ++i;
            }
            ret.push_back(cnt + '0');
            ret.push_back(c);
        }
        return ret;
    }
};

