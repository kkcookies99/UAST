 class Solution {
public:
    bool isSame(string str, int n) {
        for(int i = 0; i <= n / 2; i++) {
            if(str[i] != str[n - i]) return false;
        }
        return true;
    }
    string XXX(string s) {
        int maxc = 0;
        int l = 0;
        int r = 0;
        string  str = "";
        vector<vector<bool> > dp(s.size(), vector<bool>(s.size(), false));

        /*for(int i = 0; i < s.size(); i++) {
            dp[i][i] = true;
            if(i + 1 < s.size() && s[i] == s[i + 1] && maxc < 2) {
                maxc = 2;
                l = i;
                r = i + 1;
                dp[i][i + 1] = true;
            }
        }*/
        int lx = 0;
        int rx = 0;
        char c = s[lx];
        
        while(rx < s.size()) {
            if(s[lx] != s[rx]) {
                lx = rx;
            }
            dp[lx][rx] = true;
            if(rx - lx + 1 > maxc) {
                maxc = rx - lx + 1;
                l = lx;
                r = rx;
            }
            rx++;
        }


        for(int i = dp.size() - 1; i >= 0; i--) {
            for(int j = i; j < dp.size(); j++) {
                if(i + 1 >= dp.size() || j - 1 < 0) continue;
                if(dp[i + 1][j - 1] && s[i] == s[j]) {
                    if(j - i + 1 > maxc) {
                        maxc = j - i + 1;
                        l = i;
                        r = j;
                    }
                    dp[i][j] = true;
                }
            }
        }

        for(int i = l; i <= r; i++) {
            str += s[i];
        }

        return str;
    }
};

