 class Solution {
public:
    string XXX(string str) {
        const int n = str.size();
        if(n < 2) return str;
        int s = 0, e = 0;
        int dp[n] = {0, };
        for(int j = 0; j < n; ++j){
            for(int i = 0; i < j; ++i){
                if(!(dp[i] = dp[i + 1] || str[i] != str[j]) && (e - s) <= (j - i)) 
                    s = i, e = j;
            }
        }
        return str.substr(s, e - s + 1);
    }
};

