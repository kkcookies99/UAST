class Solution {
public:
    string XXX(int n) {
        if(n == 1) return "1";
        else {
            string s = XXX(n - 1), ans;
            char num = s[0]; int cnt = 1;
            for(int i = 1; i < s.size(); i++)
                if(s[i] != s[i - 1]) {
                    ans += to_string(cnt) + num;
                    num = s[i], cnt = 1;
                } else cnt++;
            ans += to_string(cnt) + num;
            return ans;
        }
    }
};

