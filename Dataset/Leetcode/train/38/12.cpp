class Solution {
public:
    string XXX(int n) {
        string ans;
        string s;
        if(n == 1) ans = "1";
        else if(n == 2) ans = "11";
        else {
            s = "11";
            for(int i = 2; i < n; ++i){ //次数
                ans.clear();
                for(int j = 0; j < s.size(); ++j){//对字符串进行分析
                    int cnt = 1;
                    while(s[j] == s[j + 1]){ ++cnt; ++j;}
                    if(cnt != 1) {ans += to_string(cnt); ans += s[j];}
                    else if(cnt == 1) {ans += to_string(cnt); ans += s[j];}
                }
                s = ans;
            }
        }
       
        return ans;
    }
};

